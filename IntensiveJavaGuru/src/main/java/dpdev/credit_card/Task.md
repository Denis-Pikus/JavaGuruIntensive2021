# Credit Card
## Description
Описание:
Разработать программу, которая работает в соответствии с требованиями, описанными ниже.

Функциональные требования:
Необходимо разработать класс "кредитная карта" CreditCard с учетом инкапсуляции, которая обладает следующими характеристиками:

Свойства

Номер карты
Пин-код карты
Баланс
Кредитный лимит
Задолженность по кредиту
Методы

Зачисление средств на карту ("deposit")
Снятие средств с карты ("withdraw")
При создании карты нужно указывать ее номер и пинкод. Начальный баланс и задолженность по кредиту равны 0.
Кредитный лимит можно менять после создания карты.

Требования к снятию средств:

При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;

Требования к зачислению средств:

При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
В первую очередь зачисление покрывает задолженность по кредиту;
Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;
Нефункциональные требования:
Продемонстрировать работу всех методов с учетом логический требований.

Опционально: Написать тестовые сценарии для класса CreditCard в классе CreditCardTest. Все тестовые сценарии должны отрабатывать без ошибок.