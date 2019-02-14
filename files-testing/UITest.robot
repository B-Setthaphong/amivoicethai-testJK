*** Settings ***
Library   SeleniumLibrary
Test Teardown  Close Browser

*** Variables ***
${URL}   http://localhost:8088/amivoiceThai/
${BROWSER}   opera

*** Test Case ***
Login success
    # เข้ามาหน้า login
    # login ด้วยผู้ใช้งานชื่อ somkiat
    # ต้องแสดงหน้า welcome
    แสดงหน้าแรก

*** Keywords ***
#ต้องแสดงหน้า welcome
# แสดงหน้าแรก
#     Wait Until Page Contains   TODO in workshop

แสดงหน้าแรก
    # Input Text   id=user  somkiat
    # Input Text   id=pin  12345678789
    Click Button   Get Started

เข้ามาหน้า login
    Open Browser   ${URL}
    ...  browser=${BROWSER}