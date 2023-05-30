package space.mrandika.kelaperan.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import space.mrandika.kelaperan.model.Food
import space.mrandika.kelaperan.model.FoodFactory
import javax.inject.Inject

class FoodRepository @Inject constructor() {
    suspend fun getFoods(): Flow<Result<List<Food>>> = flow {
        try {
            val response = FoodFactory.foods

            emit(Result.success(response))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Result.failure(e))
        }
    }

    suspend fun getFood(id: Int): Flow<Result<Food?>> = flow {
        try {
            val response = FoodFactory.foods.firstOrNull { food ->
                food.id == id
            }

            emit(Result.success(response))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Result.failure(e))
        }
    }

    suspend fun searchFoods(query: String): Flow<Result<List<Food>>> = flow {
        try {
            val response = FoodFactory.foods.filter { food ->
                food.name.contains(query, ignoreCase = true)
            }

            emit(Result.success(response))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Result.failure(e))
        }
    }
}