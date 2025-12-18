# laba10

### Шаг 1. Идентификация классов (красный)
University
Faculty
Institute
Employee
Research
AdministrativePersonal
Project
Course

### Шаг 2. Идентификация атрибутов (зеленый)
University(name, numberOfEmployers)
Faculty (name)
Institute (name, address)
Employee (socialSecurityNumber, name, email)
Research (researchArea)
AdministrativePersonal(departament)
Project (name, startingDate, endDate, hours)
Course (uniqueNumber, name, weeklyDuration)

### Шаг 3. Идентификация отношений
###### Обобщение:
Employee — общий родитель.
У него два подкласса: Research и AdministrativePersonal.
Research — родитель для Lecturer.

###### Агрегация / Композиция:
“Университет состоит из множества факультетов, которые в свою очередь разделены на кафедры.”
Здесь композиция, потому что факультеты не существуют без университета, кафедры не существуют без факультета.
University → Faculty 
Faculty → Institute

“Руководителем каждого факультета является декан, который является сотрудником университета.”
Здесь ассоциация между Faculty и Employee с ролью dean. Один декан может руководить только одним факультетом.
Faculty → Employee

“Каждый научный сотрудник прикреплён по крайней мере к одной из кафедр.”
Ассоциация многие-ко-многим (Research → Institute)

“Каждый научный сотрудник может быть вовлечён в проекты на определённое количество часов.”
Здесь нужна ассоциация с атрибутом (количество часов).
Создадим класс Participation (или просто связь с атрибутом hours).
Research ←→ Project через ассоциативный класс с атрибутом hours.

“Некоторые научные сотрудники могут вести учебные курсы. Тогда они называются преподавателями.”
Lecturer (подкласс Research) — ассоциация с Course.
Lecturer → Course, так как один преподаватель может вести несколько курсов.

### Шаг 4. Идентификация методов классов
University: addFaculty(), addEmployee(), CalculateTotalEmployees()
Faculty: addInstitute()
Institute: addResearchEmployee()
Employee: базовые методы для атрибутов.
Research: assignToInstitute(), joinProject()
Project: addParticipant()
Course: assignLecturer()

### Шаг 5. Генерация кода и выбор языка
Выбор языка, код см в файлах .java

### Шаг 6. Компиляция кода
Компиляция кода Idea.

### Шаг 7. Обратный инженеринг
Применил обатный инженеринг и получил диаграмму классов в Visual Paradigm

### Шаг 8. Конкретизировал модель
Сделал диаграмму прецендентов, последовательностей, состояний на plantuml, код и скриншоты см. выше
