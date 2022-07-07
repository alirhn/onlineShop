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
import com.alirhn.onlineshop.config.UnsafeSSLConfig
import com.alirhn.onlineshop.models.site.Blog
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    public fun providesApi() : Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://onlineshop/holosen.nrt:9090/")
            .client(UnsafeSSLConfig.unsafeOkHttpClient.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideSliderApi() : SliderApi{
        return providesApi().create(SliderApi::class.java)
    }

    @Provides
    @Singleton
    fun provideBlog() : BlogApi{
        return providesApi().create(BlogApi::class.java)
    }

    @Provides
    @Singleton
    fun provideContent() : ContentApi{
        return providesApi().create(ContentApi::class.java)
    }

    @Provides
    @Singleton
    fun provideInvoce() : InvoiceApi{
        return providesApi().create(InvoiceApi::class.java)
    }

    @Provides
    @Singleton
    fun provideColor(): ColorApi {
        return providesApi().create(ColorApi::class.java)
    }

    @Provides
    @Singleton
    fun provideUser() : UserApi{
        return providesApi().create(UserApi::class.java)
    }

    @Provides
    @Singleton
    fun provideProduct() : ProductApi{
        return providesApi().create(ProductApi::class.java)
    }

    @Provides
    @Singleton
    fun provideProductCategory() : ProductCategoryApi{
        return providesApi().create(ProductCategoryApi::class.java)
    }

    @Provides
    @Singleton
    fun providesTransaction() : TransactionsApi{
        return providesApi().create(TransactionsApi::class.java)
    }
}