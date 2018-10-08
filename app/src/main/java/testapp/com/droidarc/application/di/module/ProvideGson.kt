package testapp.com.droidarc.application.di.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides

///provide the gson object
// return simply gons()

@Module
public class ProvideGson {
    @Provides
    fun provideGosn(): Gson {
        var gsonBuilder = GsonBuilder();
        return gsonBuilder.create();
    }

}