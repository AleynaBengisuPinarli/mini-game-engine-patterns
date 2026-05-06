##  FAZ 1 – Creational Pattern: Factory Method

###  Nerede Kullanıldı?
Mini oyun motorunda GameObject (oyuncu, düşman vb.) nesnelerinin oluşturulması sürecinde kullanıldı. Önceden nesne oluşturma işlemi Main veya GameObject içinde yapılıyordu.

---

###  Neden Kullanıldı?

Önceki yapıda:
- Nesne oluşturma kodu dağınıktı
- Yeni bir GameObject türü eklemek için mevcut kodu değiştirmek gerekiyordu
- Bu durum Open/Closed Principle (OCP) ihlaline neden oluyordu

Bu sorunları çözmek için nesne oluşturma sorumluluğu tek bir merkezde toplanmalıdır.

---

###  Çözüm

Factory Method pattern kullanılarak GameObjectFactory sınıfı oluşturuldu.

Bu sınıf:
- Tüm GameObject nesnelerini üretmekten sorumlu hale geldi
- Main sınıfındaki doğrudan nesne oluşturma kaldırıldı

---

###  Ne Kazandım?

- Kod daha düzenli ve okunabilir hale geldi
- Nesne oluşturma merkezi bir yapıya taşındı
- Yeni nesne türü eklemek kolaylaştı (mevcut kodu değiştirmeden)
- SOLID prensiplerine (özellikle OCP ve SRP) daha uygun bir yapı oluştu

---

###  Özet

Factory Method pattern kullanılarak nesne oluşturma süreci merkezileştirildi ve sistem daha genişletilebilir hale getirildi.