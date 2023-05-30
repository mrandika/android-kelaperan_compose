package space.mrandika.kelaperan.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import space.mrandika.kelaperan.data.FoodRepository
import space.mrandika.kelaperan.viewmodel.FoodViewModel
import space.mrandika.kelaperan.viewmodel.FoodsViewModel
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ViewModelProvider {

    @Provides
    @Singleton
    fun provideFoodsViewModel(repository: FoodRepository): FoodsViewModel =
        FoodsViewModel(repository)

    @Provides
    @Singleton
    fun provideFoodViewModel(repository: FoodRepository): FoodViewModel = FoodViewModel(repository)
}