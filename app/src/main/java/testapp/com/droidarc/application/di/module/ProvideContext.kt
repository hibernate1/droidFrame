package testapp.com.droidarc.application.di.module

import android.content.Context
import dagger.Module
import dagger.Provides


//for external depenency pass the perameter by class constructor
@Module
public class ProvideContext(private val context: Context)
{
    @Provides
    fun provideContext():Context{
        return context
    }

}