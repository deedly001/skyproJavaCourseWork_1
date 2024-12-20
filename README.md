Курсовая работа в проекте SkyPro  по направлению: "Java Разработчик"

Тема «Введение в профессию и синтаксис языка»

Правила выполнения:

Вы можете свободно изучать все материалы прошедших уроков.
В течение недели вы можете задавать вопросы в чат наставнику, а также обсуждать задание с другими одногруппниками.
Задание можно сдать заранее до дедлайна
Задание будет оценена на максимальный бал только при выполнении требований "Очень сложно"

Курсовое задание. Книга сотрудников

Описание задачи:

Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.

С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:

- ✓Получить список всех сотрудников;
- ✓Посчитать сумму затрат на ЗП;
- ✓Найти сотрудника с минимальной ЗП;
- ✓Найти сотрудника с максимальной ЗП;
- ✓Подсчитать среднее значение зарплат.

Далее описаны пункты, которые нужно реализовать, чтобы сделать задание. Обратите внимание, что у задания три уровня сложности в зависимости от проработки вашей программы – необходимо сделать базовые пункты, задачи с повышенной сложностью и очень сложные – по желанию.

Рекомендуем вам прочитать все условия и выполнять их постепенно. Уверены, у вас получится сделать задание полностью!

✓ Базовая сложность

  - ✓ Создать класс Employee, который содержит информацию о ФИО, отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
  - ✓ Добавить статическую переменную-счетчик, которая будет отвечать за id.
  - ✓ Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
  - ✓ Скрыть прямой доступ к полям класса Employee и добавить возможность получать значения полей (геттеры) и устанавливать значения полей отдела и зарплаты (сеттеры).
  - ✓ Реализовать в классе Employee контракты equals и hashCode.
  - ✓ По-умолчанию все поля должны передаваться через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
  - ✓ Создать внутри класса Main метод main и поле типа Employee[10], которое будет выполнять роль "хранилища" для записей о сотрудниках.
  - ✓ Создать статические методы, которые будут взаимодействовать с массивом из пункта 6 и возвращать результат:
        - ✓ Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString));
        - ✓ Посчитать сумму затрат на ЗП в месяц;
        - ✓ Найти сотрудника с минимальной ЗП;
        - ✓ Найти сотрудника с максимальной ЗП;
        - ✓ Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
        - ✓ Распечатать ФИО всех сотрудников (метод ничего).
    
✓ Повышенная сложность

Создать дополнительные статические методы для решения следующих задач.

  - ✓ Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
  - ✓ Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):
  - ✓ Сотрудника с минимальной зп;
  - ✓ Сотрудника с максимальной зп;
  - ✓ Сумму затрат на зп по отделу;
  - ✓ Среднюю зп по отделу (учесть, что количество людей в отделе отличается от employees.length);
  - ✓ Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра;
  - ✓ Напечатать всех сотрудников отдела (все данные, кроме отдела).
  - ✓ Получить в качестве параметра число и вывести:
        - ✓ Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
        - ✓ Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).

✓ Очень сложно

Привести структуру проекта к ООП.

- ✓ Создать класс EmployeeBook;
- ✓ Перенести массив с сотрудниками в класс EmployeeBook, закрыть к нему доступ извне (сделать приватным);
- ✓ Все статические методы по работе с массивом перенести в этот класс и сделать не статическими;
- ✓ Добавить методы для управления внутренним массивом в EmployeeBook:
- ✓ Добавить нового сотрудника. (метод должен найти свободную ячейку в массиве и положить нового сотрудника в нее. Поиск свободных ячеек происходит с начала массива. Если свободных мест для сотрудника нет, то метод должен вернуть false, если для сотрудника нашлось место, то метод должен вернуть true)
- ✓ Удалить сотрудника (находим сотрудника по id, нуллим его ячейку в массиве);
- ✓ Добавить метод для получения сотрудника по id
- ✓ Инициализировать в методе main EmployeeBook и проверить корректность работы методов


