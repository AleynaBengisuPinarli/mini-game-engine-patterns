# FAZ 1 – AI LOG

##  AI’a Sorduğum Prompt

Mini oyun motoru projemde GameObject oluşturma sorumluluğunu nasıl daha iyi bir tasarıma taşıyabilirim? Factory Method pattern nasıl uygulanır? Basit bir örnekle açıklar mısın?

---

## AI Yanıtı (Özet)

AI, nesne oluşturma işleminin GameObject sınıfından ayrılarak ayrı bir Factory sınıfına taşınması gerektiğini belirtti.

Önerilen yaklaşım:
- Factory Method pattern kullanılması
- Nesne oluşturma işleminin merkezi bir sınıfa alınması
- Yeni tür eklerken mevcut kodun değiştirilmemesi

Bu sayede:
- OCP (Open/Closed Principle) sağlanır
- Kod daha genişletilebilir hale gelir

---

##  Benim Uygulamam

Ben GameObjectFactory adında bir sınıf oluşturarak nesne oluşturma işlemini bu sınıfa taşıdım.

Main sınıfında doğrudan `new` kullanmak yerine Factory üzerinden nesne üretimi yaptım.

---

## Neden Farklı / Aynı?

AI genel bir Factory yapısı önerdi, ben ise ödev kapsamına uygun olarak daha basit ve anlaşılır bir Factory Method implementasyonu kullandım.

Temel yaklaşım aynı kaldı:
- Nesne oluşturma merkezi hale getirildi
- Kod daha düzenli ve genişletilebilir oldu

---

##  Sonuç

Factory Method pattern sayesinde sistem daha esnek ve sürdürülebilir bir yapıya kavuştu.