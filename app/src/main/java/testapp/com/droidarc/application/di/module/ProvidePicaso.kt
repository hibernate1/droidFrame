package testapp.com.droidarc.application.di.module

import android.content.Context
import com.jakewharton.picasso.OkHttp3Downloader
import com.squareup.picasso.OkHttpDownloader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

//provide the picaso object
//to construct picaso we need the context
//

@Module(includes = [ProvideContext::class])
public class ProvidePicaso
{
    @Provides
    fun getPicaso(context: Context,okHttpDownloader: OkHttp3Downloader):Picasso
    {
        return Picasso.Builder(context).downloader(okHttpDownloader).build();

    }

    @Provides
    fun getOkhttpDownloader(okHttpClient: OkHttpClient):OkHttp3Downloader
    {
        return OkHttp3Downloader(okHttpClient);
    }
}