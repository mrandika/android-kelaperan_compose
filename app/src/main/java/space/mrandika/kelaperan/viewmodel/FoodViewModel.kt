package space.mrandika.kelaperan.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import space.mrandika.kelaperan.data.FoodRepository
import space.mrandika.kelaperan.model.Food
import space.mrandika.kelaperan.ui.screen.state.FoodDetailUiState
import javax.inject.Inject

@HiltViewModel
class FoodViewModel @Inject constructor(
    private val repository: FoodRepository
) : ViewModel() {
    // UI State
    private val _uiState = MutableStateFlow(FoodDetailUiState())
    val uiState: StateFlow<FoodDetailUiState> = _uiState.asStateFlow()

    suspend fun getFood(id: Int) {
        repository.getFood(id).collect { result ->
            result.onSuccess { response ->
                if (response != null) {
                    updateState(food = response)
                }
            }

            result.onFailure {
                updateState(isError = true)
            }
        }
    }

    private fun updateState(
        isError: Boolean = _uiState.value.isError,
        food: Food = _uiState.value.food
    ) {
        _uiState.update { currentState ->
            currentState.copy(
                isError = isError,
                food = food,
            )
        }
    }
}