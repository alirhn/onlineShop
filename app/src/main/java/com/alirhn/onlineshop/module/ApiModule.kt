package com.alirhn.onlineshop.module

import com.alirhn.onlineshop.api.ProductCategory.ProductCategoryApi
import com.alirhn.onlineshop.api.invoice.InvoiceApi
import com.alirhn.onlineshop.api.invoice.TransactionsApi
import com.alirhn.onlineshop.api.product.ProductApi
import com.alirhn.onlineshop.api.site.BlogApi
import com.alirhn.onlineshop.api.site.ColorApi
import com.alirhn.onlineshop.api.site.ContentApi
import com.alirhn.onlineshop.api.site.SliderApi
import com.alirhn.onlineshop.api.user.UserApi
import com.alirhn.onlineshop.repository.invoice.InvoiceRepository
import com.alirhn.onlineshop.repository.invoice.TransactionRepository
import com.alirhn.onlineshop.repository.product.ProductCategoryRepository
import com.alirhn.onlineshop.repository.product.ProductRepository
import com.alirhn.onlineshop.repository.site.BlogRepository
import com.alirhn.onlineshop.repository.site.ColorRepository
import com.alirhn.onlineshop.repository.site.ContentRepository
import com.alirhn.onlineshop.repository.site.SliderRepository
import com.alirhn.onlineshop.repository.user.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun providesSliderRepository (api: SliderApi) : SliderRepository{
        return SliderRepository(api)
    }

    @Provides
    @Singleton
    fun provideInvoiceRepository(api: InvoiceApi): InvoiceRepository {
        return InvoiceRepository(api)
    }

    @Provides
    @Singleton
    fun provideTransactionsRepository(api: TransactionsApi): TransactionRepository {
        return TransactionRepository(api)
    }

    @Provides
    @Singleton
    fun provideBlogRepository(api: BlogApi): BlogRepository {
        return BlogRepository(api)
    }


    @Provides
    @Singleton
    fun provideColorRepository(api: ColorApi): ColorRepository {
        return ColorRepository(api)
    }

    @Provides
    @Singleton
    fun contentProvideRepository(api: ContentApi): ContentRepository {
        return ContentRepository(api)
    }

    @Provides
    @Singleton
    fun provideUserUser(api : UserApi): UserRepository {
        return UserRepository(api)
    }

    @Provides
    @Singleton
    fun provideProductCategoryRepository(api: ProductCategoryApi): ProductCategoryRepository {
        return ProductCategoryRepository(api)
    }

    @Provides
    @Singleton
    fun providesProductRepository(api: ProductApi): ProductRepository {
        return ProductRepository(api)
    }
}