# Mobile Automation with Cucumber in Java


@search
<br>Feature: Konum kaydetme senaryosu
<br>Misafir kullanıcısı olarak uygulamayı açıp
<br>İl,ilçe,mahalle girerek konum kaydedip
<br>Herhangi bir kategoriye ait ürünleri listelemek istiyorum.

@quick-cases<br>
  Scenario: 1-Konum kaydetme<br>
    Given Uygulama acilir<br>
    When PopUp ekranindaki Devam Tamam ve Reklam kapatma butonlarina sira sira tiklanir<br>
      And Anasayfada Konum alanina tiklanir<br>
      And İl ilce ve mahalle secilir ve kaydet butonuna tiklanir<br>
      And Tab bar uzerinden kategoriler tabına tiklanir<br>
      And Herhangi bir kategori secilip urun listeleme sayfasina yonlendirilir<br>
     Then Secilen urun kategorisinin listelendigi gorulur<br>
![1](https://user-images.githubusercontent.com/75911392/181192289-b4021ffa-0ae2-44c2-8b2f-3cee9163b9ea.PNG)
![2](https://user-images.githubusercontent.com/75911392/181192309-da89a61c-9d19-4a39-815d-95cfaa3d2c2f.PNG)
![3](https://user-images.githubusercontent.com/75911392/181192324-344ebbb5-8f72-4ba1-b94c-804ba0119946.PNG)

# Cucumber JVM

[![#StandWithUkraine](https://raw.githubusercontent.com/vshymanskyy/StandWithUkraine/main/badges/StandWithUkraine.svg)](https://vshymanskyy.github.io/StandWithUkraine)
[![OpenCollective](https://opencollective.com/cucumber/backers/badge.svg)](https://opencollective.com/cucumber) 
[![OpenCollective](https://opencollective.com/cucumber/sponsors/badge.svg)](https://opencollective.com/cucumber)
[![Maven Central](https://img.shields.io/maven-central/v/io.cucumber/cucumber-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.cucumber%22%20AND%20a:%22cucumber-java%22)
[![Build Status](https://github.com/cucumber/cucumber-jvm/workflows/Cucumber%20CI/badge.svg)](https://github.com/cucumber/cucumber-jvm/actions)
[![Coverage Status](https://codecov.io/gh/cucumber/cucumber-jvm/branch/main/graph/badge.svg)](https://codecov.io/gh/cucumber/cucumber-jvm/branch/main)

Cucumber-JVM is a pure Java implementation of Cucumber. 
You can [run](https://cucumber.io/docs/cucumber/api/#running-cucumber) it with 
the tool of your choice.

Cucumber-JVM also integrates with all the popular 
[Dependency Injection containers](https://cucumber.io/docs/installation/java/#dependency-injection).

## Getting started
 * [Installation](https://cucumber.io/docs/installation/java/)
 * [Documentation](https://cucumber.io/docs/cucumber/)
 * [Hello World project](https://github.com/cucumber/cucumber-java-skeleton)

## Questions, Problems, Help needed?

Please ask on 
 * [Stack Overflow](https://stackoverflow.com/questions/tagged/cucumber-jvm).
 * [CucumberBDD Slack](https://cucumberbdd-slack-invite.herokuapp.com/) <sup>[direct link](https://cucumberbdd.slack.com/)</sup>

## Bugs and Feature requests

You can register bugs and feature requests in the 
[Github Issue Tracker](https://github.com/cucumber/cucumber-jvm/issues). 

Please bear in mind that this project is almost entirely developed by 
volunteers. If you do not provide the implementation yourself (or pay someone 
to do it for you), the bug might never get fixed. If it is a serious bug, other 
people than you might care enough to provide a fix.

## Contributing 

If you'd like to contribute to the documentation, checkout 
[cucumber/docs.cucumber.io](https://github.com/cucumber/docs.cucumber.io) 
otherwise see our
[CONTRIBUTING.md](https://github.com/cucumber/cucumber-jvm/blob/main/CONTRIBUTING.md).
