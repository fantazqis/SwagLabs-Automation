Feature: Test Cart Function
  Scenario: TS021 Menu Add To Cart Function
    When TS021 Clear Halaman Login
    And TS021 Input Username <username>
    And TS021 Input Password <password>
    And TS001 Klik Tombol Login
    Then TS021 Validasi Halaman Menu
    When TS021 Klik Add To Cart Item 1

  Scenario: TS023 Item Menu Add To Cart Function
    When TS023 Klik Item 2
    And
    And TS001 Input Username <username>
    And TS001 Input Password <password>
    And TS001 Klik Tombol Login
    Then TS001 Validasi Halaman Menu
    When TS001 Klik Add To Cart Item 1


