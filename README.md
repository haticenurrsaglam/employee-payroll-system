# Employee Payroll System / Çalışan Maaş Sistemi

A console-based employee payroll management system built in Java, demonstrating core OOP principles.  
Java ile geliştirilmiş, temel OOP prensiplerini sergileyen konsol tabanlı çalışan maaş yönetim sistemi.

---

## OOP Concepts Used / Kullanılan OOP Kavramları

| Concept | Usage / Kullanım |
|---------|-----------------|
| Abstraction | `Employee` abstract class |
| Inheritance | `SalariedEmployee`, `HourlyEmployee`, `CommissionEmployee`, `BasePlusCommissionEmployee` |
| Polymorphism | `earning()`, `applyRaise()`, `toString()` overrides |
| Encapsulation | Private fields with getters/setters and input validation |
| Interface | `Comparator<Employee>` via `SalaryComparator` |

---

## Employee Types / Çalışan Tipleri

| Type / Tip | Earning Calculation / Maaş Hesabı |
|------------|----------------------------------|
| `SalariedEmployee` | Fixed weekly salary / Sabit haftalık maaş |
| `HourlyEmployee` | Regular + 1.5x overtime (>40h) / Normal + fazla mesai |
| `CommissionEmployee` | Gross sale × commission rate / Ciro × komisyon oranı |
| `BasePlusCommissionEmployee` | Commission earning + base salary / Komisyon + baz maaş |

---

## Features / Özellikler

- Salary sorting (highest to lowest) via `Comparator` / `Comparator` ile büyükten küçüğe sıralama
- Polymorphic raise system — 10% raise applied per employee type / Polimorfik zam sistemi
- Input validation (negative wage, invalid hours, commission rate 0–1) / Girdi doğrulama
- Clean inheritance hierarchy / Temiz kalıtım hiyerarşisi

---

## Build & Run / Derleme ve Çalıştırma

```bash
javac *.java
java Main
```

---

## Project Structure / Proje Yapısı

```
Employee.java                     # Abstract base class
├── SalariedEmployee.java         # Fixed salary employee
├── HourlyEmployee.java           # Hourly wage employee
└── CommissionEmployee.java       # Commission-based employee
      └── BasePlusCommissionEmployee.java  # Commission + base salary
SalaryComparator.java             # Comparator for salary sorting
Main.java                         # Entry point
```

---

## Future Improvements / Geliştirme Fikirleri

- `Department` class — department-based salary reports / Departman bazlı maaş raporu
- `PayrollReport` class — summary statistics (total, average, min/max) / Özet istatistikler
- `Manager extends SalariedEmployee` — bonus system / Bonus sistemi
- File I/O — save and load employee records (CSV) / Çalışan verilerini dosyaya kaydetme
