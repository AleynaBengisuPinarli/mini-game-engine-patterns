# PROBLEMS ANALYSIS (FAZ 0)

## 1. God Class Problemi

GameObject sınıfı, oyuncu, düşman ve boss gibi birden fazla nesne türünü aynı yapı içinde yönetmektedir. Bu durum Tek Sorumluluk Prensibi’ni (SRP) ihlal eder ve sınıfın bakımını zorlaştırır.

---

## 2. Tip Bazlı Koşul Kullanımı (If-Else Zinciri)

Tüm davranışlar "type" değişkenine bağlı if-else blokları ile kontrol edilmektedir. Yeni bir tür eklemek için mevcut kodun değiştirilmesi gerekir, bu da sistemin kırılgan olmasına neden olur.

---

## 3. Açık/Kapalı Prensibi (OCP) İhlali

Sistem genişlemeye açık değildir. Yeni bir karakter türü eklemek için mevcut kodun değiştirilmesi gerekir. Bu durum OCP prensibine aykırıdır.

---

## 4. Sıkı Bağlılık (Tight Coupling)

Davranışlar doğrudan GameObject sınıfına bağlıdır. Bu durum kodun esnekliğini azaltır ve bağımsız değişiklik yapmayı zorlaştırır.

---

## 5. Zayıf Ölçeklenebilirlik

Yeni nesne türleri eklendikçe if-else blokları artmaktadır. Bu durum kodun okunabilirliğini düşürür ve bakım maliyetini artırır.

---

#  YAPAY ZEKA ANALİZİ

## Kullanılan Prompt

"Bu kodda hangi tasarım sorunlarını görüyorsun? Hangi tasarım örüntüleri bu sorunları çözebilir? Her sorun için kısa açıklama yaz."

---

## AI Tespitleri

Yapay zeka aşağıdaki sorunları tespit etmiştir:

- God Class problemi  
- Aşırı if-else kullanımı  
- SOLID prensiplerinin ihlali  
- Sınıflar arası sıkı bağımlılık  
- Genişletilebilirlik eksikliği  

---

## AI’nin Önerdiği Tasarım Örüntüleri

- Factory Method (nesne oluşturmayı yönetmek için)  
- Strategy Pattern (davranışları ayırmak için)  
- Observer Pattern (event tabanlı yapı için)  

---

#  KARŞILAŞTIRMA (BEN vs AI)

## Benzerlikler
- God Class problemi her iki analizde de tespit edilmiştir.
- if-else yapısının sorunlu olduğu belirtilmiştir.
- sistemin genişletilebilir olmadığı vurgulanmıştır.

---

## Farklılıklar
- AI, SOLID prensiplerine daha teknik yaklaşmıştır.
- AI daha fazla tasarım örüntüsü önermiştir.
- Benim analizim daha pratik gözlemlere odaklanmıştır.

---

## Sonuç

Her iki analiz de uyumludur. Sistem bilinçli olarak kötü tasarlanmıştır ve sonraki fazlarda tasarım örüntüleri ile yeniden yapılandırılacaktır.