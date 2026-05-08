# AI Kullanımı (Phase 2)
## Soru 1

>Adapter pattern burada uygun mu, yoksa Facade mı? Farkını açıkla.

Cevap:

Adapter Pattern, uyumsuz arayüzlere sahip sistemleri birbirine uyumlu hale getirmek için kullanılır. Facade Pattern ise karmaşık bir sistemi basitleştirilmiş tek bir arayüz üzerinden dış dünyaya sunar.

Bu proje bağlamında LegacyEnemy sınıfı ile GameObjectComponent arasında doğrudan uyumsuzluk bulunduğu için problem “arayüz uyumluluğu” problemidir. Bu nedenle Adapter Pattern doğru çözümdür, Facade Pattern ise sistem karmaşıklığını gizleme amacı taşıdığı için uygun değildir.

## Soru 2

>Decorator pattern ile inheritance arasındaki fark nedir ve hangi durumda Decorator tercih edilmelidir?

 Cevap:

Inheritance, sınıflar arasında kalıcı ve katı bir hiyerarşi oluşturur. Bu durum esnekliği azaltır ve kodun genişletilmesini zorlaştırır.

Decorator Pattern ise composition kullanarak nesnelere çalışma zamanında dinamik olarak yeni davranışlar eklenmesini sağlar. Bu sayede mevcut sınıflar değiştirilmeden sistem genişletilebilir.

Bu projede Decorator Pattern, oyuncu gibi nesnelere (örneğin Shield özelliği) dinamik davranış eklemek için daha uygun bir çözüm olduğu için tercih edilmiştir.

## Değerlendirme

AI tarafından verilen açıklamalar genel olarak doğru, tutarlı ve yönlendiricidir. Özellikle Adapter ve Facade ile Decorator ve inheritance arasındaki temel farkların net şekilde açıklanması, doğru pattern seçimi için iyi bir referans oluşturmuştur.

Ancak AI’nın önerileri daha çok teorik karşılaştırmalar üzerinden ilerlemiştir. Bu nedenle verilen cevaplar, doğrudan proje bağlamına uygulanmadan önce ayrıca değerlendirilmiştir.

Nihai tasarım kararları sadece tanımlara göre değil, projenin gerçek ihtiyaçlarına göre verilmiştir. Bu kapsamda:

- sistemde legacy bir yapının yeni mimariye entegre edilmesi ihtiyacı Adapter Pattern seçimini gerekli kılmıştır.
- nesnelere çalışma zamanında dinamik özellik ekleme ihtiyacı Decorator Pattern seçimini desteklemiştir

Bu süreçte, teorik bilgi ile pratik mimari ihtiyaçlar birleştirilerek daha doğru ve sürdürülebilir bir tasarım kararı verilmiştir

## Sonuç
- Adapter → legacy sistem uyumluluğu
- Decorator → dinamik davranış genişletme
- Seçimler problem tipine göre yapılmıştır