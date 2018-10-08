package testapp.com.droidarc.application.di.module

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import testapp.com.droidarc.utility.ConstantVeriable

//provide the sharepreference

@Module(includes = [ProvideContext::class])
public class ProvideSharePreference
{
    @Provides
    fun provideSharePreferenceObject(context: Context): SharedPreferences
    {
        return context.getSharedPreferences(ConstantVeriable.sharePreferenceKey,Context.MODE_PRIVATE)
    }
}