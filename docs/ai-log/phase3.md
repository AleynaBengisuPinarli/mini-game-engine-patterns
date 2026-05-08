## Oturum Özeti

Bu fazda AI ile birlikte yaklaşık 30–45 dakika süren bir pair programming süreci gerçekleştirilmiştir. Çalışma boyunca Phase 3 (Behavioral Patterns) kapsamında sistemin mimari yapısı geliştirilmiş, mevcut kodlar yeniden düzenlenmiş ve tasarım daha tutarlı ve genişletilebilir hale getirilmiştir.

AI, özellikle yazılım mimarisinin doğru kurgulanması, tasarım desenlerinin doğru uygulanması ve sınıflar arası ilişkilerin doğru şekilde modellenmesi konularında rehberlik sağlamıştır. Süreç iteratif bir şekilde ilerlemiş, her aşamada çıkan hatalar analiz edilerek sistem üzerinde iyileştirmeler yapılmıştır.

Ayrıca kod yapısının OOP prensiplerine uygunluğu kontrol edilmiş ve özellikle SOLID prensiplerine (özellikle Open/Closed Principle) uyum artırılmıştır.

## Tartışılan Konular ve İlerleme

AI ile yapılan çalışma sırasında aşağıdaki konular detaylı ve sistematik şekilde ele alınmıştır:

- Strategy Pattern implementasyonu ve farklı saldırı algoritmalarının (Melee / Ranged) doğru şekilde tasarlanması ve runtime’da değiştirilebilir hale getirilmesi
- Observer Pattern kullanılarak event-driven bir mimari kurulması ve GameEventManager üzerinden olay yönetiminin sağlanması
- GameObject sınıfının davranışlarının ayrıştırılması, sorumluluklarının netleştirilmesi ve daha modüler hale getirilmesi
- UML diyagramının oluşturulması, eksik sınıfların tamamlanması ve tüm sistem mimarisinin görsel olarak netleştirilmesi
- Factory, Adapter ve Decorator pattern’lerinin proje içerisinde doğru katmanlara yerleştirilmesi ve birlikte çalışabilir hale getirilmesi
- Git workflow sürecinin yönetilmesi (branch oluşturma, commit düzeni, push işlemleri ve versiyon kontrolü)
- GitHub Actions CI pipeline kurulumu ile otomatik build ve hata kontrol mekanizmasının eklenmesi
- README.md dosyasının düzenlenmesi ve proje dokümantasyonunun akademik standartlara uygun hale getirilmesi
- Dosya yapısının düzenlenmesi ve proje klasör mimarisinin standardize edilmesi

##  AI’nin Yanılttığı / Düzeltildiği Noktalar

Çalışma süreci boyunca AI bazı noktalarda başlangıçta eksik veya kısmen hatalı yönlendirmelerde bulunmuştur. Bu durumlar süreç içinde manuel kontrol ile düzeltilmiştir:

- UML diyagramında bazı sınıf ilişkileri ve bağlantılar ilk aşamada eksik veya yanlış önerilmiştir, sonradan tamamlanarak sistem bütünlüğü sağlanmıştır
- GameObject constructor yapısı ile component-based yapı arasında başlangıçta uyumsuzluk oluşmuş, kod refactoring ile giderilmiştir
- Git commit stratejisinde tek commit yaklaşımı önerilmiş, ancak proje standardı gereği daha modüler commit yapısı tercih edilmiştir
- Dosya isimlendirme ve uzantı hataları (.txt, .yml, UML dosya adı gibi) Windows dosya sistemi davranışlarından dolayı oluşmuş ve düzeltilmiştir
- Strategy ve Observer pattern implementasyonlarında bazı method eksiklikleri başlangıçta fark edilmemiş, sonradan debug edilerek tamamlanmıştır

## AI Olmadan Tahmini Süre

Bu faz AI desteği olmadan geliştirilecek olsaydı:

# 6 – 10 saat arası sürebilirdi

Çünkü:

- Tasarım desenlerinin araştırılması ve doğru uygulanması
- UML diyagramının manuel çizimi ve doğrulanması
- Debugging ve hata ayıklama sürecinin daha uzun sürmesi
- Git/GitHub workflow ve CI pipeline kurulumunun ayrı ayrı öğrenilmesi

AI desteği ile birlikte süreç:

# 2 – 3 saat içerisinde tamamlanmıştır

Bu durum özellikle tekrar eden hataların hızlı analiz edilmesi ve doğru mimari yönlendirme sayesinde mümkün olmuştur.

## Sonuç

AI bu süreçte yazılım geliştirme sürecinin birçok aşamasında önemli katkılar sağlamıştır:

- Yazılım mimarisinin tasarlanması ve optimize edilmesi
- Design pattern’lerin doğru ve tutarlı şekilde uygulanması
- Debugging sürecinin hızlandırılması ve hata çözümünün kolaylaştırılması
- UML diyagramının profesyonel şekilde oluşturulması
- Git/GitHub workflow yönetiminin düzenlenmesi
- CI/CD pipeline kurulumu ile otomasyon sağlanması
- Dokümantasyonun akademik ve profesyonel seviyeye getirilmesi

Genel olarak AI, geliştirme sürecini hızlandırmış, daha doğru kararlar alınmasını sağlamış ve sistemin daha sürdürülebilir bir mimariye sahip olmasına yardımcı olmuştur.