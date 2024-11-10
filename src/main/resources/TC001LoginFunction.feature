Feature: Test Function
  Scenario: TS001 Login Valid
    When TS001 Membuka Halaman Web
    And TS001 Validasi Halaman Login
    And TS001 Input Username <username>
    And TS001 Input Password <password>
    And TS001 Klik Tombol Login
    Then TS001 Validasi Halaman Menu
    When TS001 Klik Tombol Hamburger
    And TS001 Klik Logout
    Then TS001 Validasi Kembali Ke Halaman Login

    Examples:
      | username      | password      |
      | standard_user | secret_sauce  |
