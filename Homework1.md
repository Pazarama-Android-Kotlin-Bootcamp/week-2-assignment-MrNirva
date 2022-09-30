## Lifecycle Nedir?

Android uygulama için yaşam döngüsünü temsil eder. Uygulamayı ilk çalıştırdığımız andan itibaren başlar ve 
uygulamayı tamamen kapatıncaya kadar devam eder. Kullanıcılar uygulamada gezinirken geçtikleri durumları 
anlamamıza yardımcı olur. Bu sayede doğru zamanda doğru işlemleri yaptırabilir, çökmeleri ve diğer hataları önleyebiliriz.

## Nasıl Yönetiriz?

onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy() ve onRestart()

Yukarıda yer alan metotlar'ın her birisi yaşam döngüsünün birer parçasını temsil eder. Yönetimi bu metotlar üzerinden yaparız.

Kısaca Açıklamak Gerekirse

### onCreate()

Activity ilk açıldığında gerçekleşen olayları içinde barındırır.

### onStart()

Bu metot devreye girdiğinde uygulama kullanıcıya görünür hale gelir.

### onResume()

Bu metot kullanıcıyla etkileşime girildiği durumdur.

### onPause()

Sistem uygulamanın bir nevi kapandığını bildirdiği zaman çalışır. 
Uygulamamız arkaplana atıldığı zaman, arama geldiği zaman ya da başka bir uygulama açıldığı zaman çalışır.

### onStop()

Kullanıcı uygulamadan çıkış yaptığında buradaki kodlar çalışmaktadır.

### onDestroy()

Activity sistem tarafından yok edilmeden önce, uygulama kapanmadan önce çalışan metot.

### onRestart()

Activity durdurulduktan sonra tekrar başlatılınca bu metot çalışır.

### Bazı Senaryolar

1) Uygulama ilk çalıştığında

onCreate() –> onStart() –> onResume()

2) Geri (üçgen) tuşuna basıldığında

onBackPressed() –> onPaused() –> onStop() –> onDestroy()

3) Geri (üçgen) tuşuna basılıp arkaya alındıktan sonra yeniden çağırıldığında

onCreate() –> onStart() –> onResume()

4) Home ve Arka plan (yuvarlak, kare) tuşuna basıldığında

onPaused() –> onStop()

5) Uygulama Home ve Arka plan (yuvarlak, kare) tuşuna basılıp arkaya alındıktan sonra yeniden çağırıldığında

onRestart() -> onStart() –> onResume()

### Yaşam Döngüsü Şeması

![https://developer.android.com/guide/components/images/activity_lifecycle.png](https://developer.android.com/guide/components/images/activity_lifecycle.png)

## Ne gibi problemler olur ve nasıl kaçınırız?

#### Ekranı yan çevirince UI ve Datada bozulmalara neden olabilir
Bundan kaçınmak için live data - data binding gibi çözümleri içeren mvvm mimarisi tercih edilebilir.
https://developer.android.com/guide/topics/resources/runtime-changes

#### OnDestroy
Bu metot her zaman çalışmayabilir. Bu nedenle kodlarımızı buraya yazmamız tavsiye edilmez.
https://developer.android.com/reference/android/app/Activity#onDestroy()

#### Telefon ayarlarından dil değişimi
Bunun için ekstra bir yapılandırma yazmazsak OnDestroy duruma getirildikten sonra uygulama yeniden başlatılabilir.
https://docs.nvidia.com/tegra/Content/AN_LC_Surprise_App_Events.html

#### Harici klavyeyi takıp çıkarma bu işlem sonrası yaşam döngüsünün tetiklenmesi
Özellikle tabletler için sıklıkla yapılabilecek bir durumdur. Bu işlemi gözlemlemek için yapılandırmaya keyboard tagi eklenebilir.
https://docs.nvidia.com/tegra/Content/AN_LC_Surprise_App_Events.html



