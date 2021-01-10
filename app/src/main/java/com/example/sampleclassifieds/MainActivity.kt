package com.example.sampleclassifieds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sampleclassifieds.image_loader.ImageLoader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImageLoader.with(this).load(test_image_view, "https://demo-app-photos-45687895456123.s3.amazonaws.com/9355183956e3445e89735d877b798689?AWSAccessKeyId=ASIASV3YI6A45I573MXG&Signature=Pfvo5Yh7SsLLHWLd%2BnLtIxL7kq4%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEMX%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQCY4akKYNE1mbhKJOdnM1gZNKdu7T86CDZnTk9Yr0sb1gIhAL5%2BWCY2lUCoj5PiQSC9ItjIO8zS%2B2%2FCLbwV4GxoG2BgKtcBCI7%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQAhoMMTg0Mzk4OTY2ODQxIgwDmcE20FEwEn%2B%2B0yQqqwGOqygE4pMd%2FYvlHdN2ZDG0pW7CI8Ywr0%2FPbzyDRrBg4BBwlwKiSW06pLEpilFMoOnMFz%2Fr%2FlitI9%2BLZ%2FM6OBybS4ztQsw%2FlCArGcVI4qgDZHymuOt4vTGPbP959%2Fw%2FHYZz4slZs%2FmfMxacGq5J350FM1YwBW0aG5cX4wyn4k%2BGBtYDWUnaR6X2qmYbIVcYncFlPYqu2BCRgZQBlq6bdRHdNF7tmJ4uH8svQ7cwze%2Fr%2FwU63wFuZgpp4qITmseSuBof0Z3dwhZbUmFLQFZ6DLCE5cn6uJWH7WONggwfTxNFAXMIySJRIctOpibVxaLAKzn%2BWhfOz%2BWgOEOOBopKyxKlHzmeUyyCof1WVcVN0%2FV5EVvuOiNDilVdhKrJLB2oE9apc6uRTTkaaG1l1XiP%2FC2IskCmN5RveFqNv%2FOz0AlOAmMaKmWkjZ1ju5wISUy85c2tex8GYnsrFhY%2ByTK5MhBER6ZavSwtv6HYEtve1ensRkMWoqHuDkeUqOlhlx%2FwM6hvNF3nhpX2912t5nWhTaeManFw&Expires=1610286560")
    }
}