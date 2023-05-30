package space.mrandika.kelaperan.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import space.mrandika.kelaperan.data.FoodRepository
import space.mrandika.kelaperan.model.Food
import space.mrandika.kelaperan.ui.screen.state.HomeUiState
import javax.inject.Inject

@HiltViewModel
class FoodsViewModel @Inject constructor(
    private val repository: FoodRepository
) : ViewModel() {
    // UI State
    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            getFoods()
        }
    }

    private suspend fun getFoods() {
        repository.getFoods().collect { result ->
            result.onSuccess { response ->
                updateState(foods = response)
            }

            result.onFailure {
                updateState(isError = true)
            }
        }
    }

    suspend fun searchFoods(query: String) {
        repository.searchFoods(query).collect { result ->
            result.onSuccess { response ->
                updateState(foods = response)
            }

            result.onFailure {
                updateState(isError = true)
            }
        }
    }

    fun updateQuery(query: String) {
        updateState(query = query)

        viewModelScope.launch {
            searchFoods(query)
        }
    }

    fun updateSearchState(state: Boolean) {
        updateState(isSearchActive = state)
    }

    private fun updateState(
        isError: Boolean = _uiState.value.isError,
        foods: List<Food> = _uiState.value.foods,
        query: String = _uiState.value.query,
        isSearchActive: Boolean = _uiState.value.isSearchActive
    ) {
        _uiState.update { currentState ->
            currentState.copy(
                isError = isError,
                foods = foods,
                query = query,
                isSearchActive = isSearchActive
            )
        }
    }
}