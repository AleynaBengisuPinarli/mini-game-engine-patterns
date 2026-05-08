1. Decorator Pattern

## Amaç

Decorator Pattern, nesnelere mevcut yapıyı değiştirmeden çalışma zamanında (runtime) yeni davranışlar eklemek için kullanılır. Bu sayede inheritance yerine composition kullanılarak daha esnek ve genişletilebilir bir mimari oluşturulur.

## Kullanım

Bu projede Decorator Pattern şu sınıflarla uygulanmıştır:

GameObjectComponent → temel arayüz
Player → temel concrete component
GameObjectDecorator → abstract decorator (wrapper sınıf)
ShieldDecorator → somut decorator (ek özellik)

## Çalışma Mantığı
Decorator yapısı, bir GameObjectComponent nesnesini sararak (wrap ederek) onun davranışını genişletir. Örneğin ShieldDecorator, oyuncuya ek savunma özelliği ekler. Bu yapı sayesinde mevcut sınıflar değiştirilmeden yeni özellikler eklenebilir.

## Kazanımlar
- Open/Closed Principle desteklenir (mevcut kod değişmeden genişler)
- Runtime’da dinamik özellik eklenebilir
- if-else gibi kontrol yapıları azaltılır
- Daha modüler ve esnek yapı sağlanır

2. Adapter Pattern

## Amaç

Adapter Pattern, birbirine uyumsuz arayüzlere sahip sınıfların birlikte çalışmasını sağlamak için kullanılır. Özellikle legacy sistemleri yeni mimariye entegre etmek için idealdir.

## Kullanım

Bu projede Adapter Pattern şu sınıflarla uygulanmıştır:

LegacyEnemy → eski sistem (uyumsuz yapı)
EnemyAdapter → adaptör sınıfı
GameObjectComponent → hedef arayüz

## Çalışma Mantığı

EnemyAdapter, legacy sınıfı sararak onu yeni sistemin beklediği GameObjectComponent yapısına uygun hale getirir. Böylece eski kod değiştirilmeden yeni mimariye entegre edilir.

## Kazanımlar
Legacy kod korunur (reusability)
Backward compatibility sağlanır
Sistem mimarisi bozulmadan genişletilir
Entegrasyon süreci kolaylaşır

## Genel Sonuç

Bu fazda sistem, Structural Design Patterns kullanılarak daha esnek, genişletilebilir ve sürdürülebilir bir yapıya dönüştürülmüştür. Decorator Pattern runtime davranış eklemek için, Adapter Pattern ise legacy sistem entegrasyonu için kullanılmıştır.