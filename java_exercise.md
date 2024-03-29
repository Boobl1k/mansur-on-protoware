Общее требование:
Необходимо предоставить примеры использования в unit-test'ах.

===
# Algo

## Задание 1: Реализация стека и очереди

### Цели:
- Создать класс `MyStack` с операциями `push`, `pop`, и `peek`.
- Создать класс `MyQueue` с операциями `enqueue`, `dequeue`, и `peek`.
- Написать unit-тесты для проверки реализованных структур данных.

### Требования:
- Не использовать стандартные классы стека и очереди из Java.
- Проверить работоспособность реализованных методов с помощью unit-тестов.

## Задание 2: Реализация двоичного поиска и сортировки слиянием

### Цели:
- Написать метод `binarySearch` для выполнения двоичного поиска в отсортированном массиве.
- Реализовать функцию `mergeSort` для сортировки массива методом слияния.
- Протестировать написанные методы на различных наборах данных.

### Требования:
- `binarySearch` должен возвращать индекс элемента, если он найден, и `-1`, если элемент отсутствует.
- `mergeSort` должен корректно сортировать входные данные.


## Задание 3: Работа с бинарным деревом поиска (BST)

### Цели:
- Реализовать класс `BinarySearchTree` с операциями `insert`, `delete`, `search`, `inOrderTraversal`.
- Проверить корректность работы всех реализованных операций.

### Требования:
- Метод `insert` должен корректно добавлять элементы, сохраняя свойства BST.
- Метод `delete` должен удалять элементы, сохраняя структуру BST.
- Метод `search` должен эффективно находить элементы в дереве.
- `inOrderTraversal` должен выводить все элементы дерева в отсортированном порядке.
- Необходимо написать unit-тесты для проверки каждой операции.


===
# JVM

## Задание 1: Анализ использования памяти JVM

### Цель:
- Написать программу, которая демонстрирует управление памятью в JVM.

### Задачи:
1. Создайте Java-приложение, которое активно использует различные структуры данных (например, массивы, списки).
2. В вашем приложении добавьте вывод информации о текущем использовании памяти JVM (общее количество памяти, максимально доступное количество памяти, свободная память).
3. Проанализируйте, как изменяется потребление памяти при выполнении вашего приложения.

## Задание 2: Работа сборщика мусора

### Цель:
- Изучить процесс сборки мусора в JVM на практике.

### Задачи:
1. Создайте приложение, которое генерирует большое количество временных объектов.
2. Принудительно инициируйте сборку мусора с помощью `System.gc()` и наблюдайте за результатом.
3. Добавьте в приложение логирование для мониторинга сборки мусора и анализа ее выполнения.

## Задание 3: Исследование ClassLoader

### Цель:
- Понять, как работают классы загрузчики в Java.

### Задачи:
1. Создайте простой пользовательский класс загрузчик, который будет загружать классы из заданного каталога.
2. Используйте ваш класс загрузчика для загрузки и выполнения простого Java-класса.
3. Проведите эксперимент, показывающий, что класс, загруженный разными загрузчиками, считается разными классами в пределах JVM.

Эти задания позволяют проверить практические знания кандидата по управлению памятью в JVM, понимание работы сборщика мусора и способность работы с классами загрузчиками.

===
# Java Core

## Задание 1: Инкапсуляция и наследование

### Цель:
- Продемонстрировать понимание инкапсуляции и наследования.

### Задачи:
1. Создайте класс `Animal` с приватным полем `name` и методами для доступа к этому полю (геттер и сеттер).
2. Создайте класс `Dog`, который наследуется от `Animal` и добавьте в него поле `breed` (порода).
3. В классе `Dog` переопределите метод для получения имени, так чтобы он возвращал информацию и о породе собаки.

## Задание 2: Обработка исключений

### Цель:
- Понять различия между checked и unchecked исключениями и научиться их обрабатывать.

### Задачи:
1. Создайте метод, который генерирует checked исключение.
2. Создайте метод, который генерирует unchecked исключение.
3. В методе `main` вызовите эти методы и корректно обработайте исключения.

## Задание 3: Работа со строками и String Pool

### Цель:
- Продемонстрировать понимание работы со строками и концепции String Pool.

### Задачи:
1. Создайте несколько строковых переменных разными способами (с использованием оператора `new` и без него).
2. Сравните эти переменные между собой с использованием `==` и `equals()`.
3. Проанализируйте результаты сравнения и объясните, почему они такие.

Эти задания позволяют проверить знания кандидата по основным темам Java Core, таким как инкапсуляция, наследование, обработка исключений, а также работа со строками и понимание String Pool.

===
# Java Collections

## Задание 1: Работа со списками

### Цель:
- Понять разницу между ArrayList и LinkedList.

### Задачи:
1. Создайте ArrayList и LinkedList, содержащие 1000000 целых чисел каждый.
2. Измерьте время добавления нового элемента в начало, середину и конец каждого списка.
3. Измерьте время удаления элемента из начала, середины и конца каждого списка.
4. Сравните результаты и сделайте выводы о различиях в производительности двух типов списков.

## Задание 2: Использование Map

### Цель:
- Изучить поведение и особенности работы с HashMap и TreeMap.

### Задачи:
1. Создайте HashMap и TreeMap, добавьте в них элементы, представляющие пары "ключ-значение" (например, идентификатор пользователя и его имя).
2. Проитерируйте обе карты и выведите содержимое на экран, обратите внимание на порядок элементов.
3. Попробуйте добавить в эти структуры одинаковые элементы и наблюдайте за результатом.
4. Сравните производительность операций поиска в обеих картах.

## Задание 3: Сравнение элементов в коллекции

### Цель:
- Понять применение интерфейсов Comparable и Comparator.

### Задачи:
1. Создайте класс `Person` с полями `name` (String) и `age` (int).
2. Реализуйте интерфейс Comparable в классе `Person`, сравнивая людей по возрасту.
3. Создайте список из объектов `Person` и отсортируйте его с использованием `Collections.sort()`.
4. Создайте Comparator, который сравнивает людей по имени, и используйте его для сортировки того же списка.
5. Сравните результаты сортировки и проанализируйте различия.

Эти задания позволяют проверить знания кандидата по работе с основными структурами данных в Java Collections, а также понимание различий между ними и принципами их использования.


===
# java.util.concurrent

## Задание 1: Работа с ExecutorService

### Цель:
- Понять основные принципы работы с ExecutorService.

### Задачи:
1. Создайте пул из нескольких потоков с использованием ExecutorService.
2. Запустите в пуле несколько задач, которые выполняют простые математические операции или выводят сообщения в консоль.
3. Дождитесь завершения выполнения всех задач и остановите ExecutorService.

## Задание 2: Использование CountDownLatch

### Цель:
- Изучить принцип работы и применение CountDownLatch.

### Задачи:
1. Создайте три потока, которые выполняют различные задачи (например, обработку данных).
2. Используйте CountDownLatch для ожидания завершения всех этих задач.
3. В основном потоке ожидайте, пока все задачи не будут выполнены, используя CountDownLatch, и только после этого продолжайте выполнение.

## Задание 3: Работа с ConcurrentHashMap

### Цель:
- Понять принципы работы и преимущества ConcurrentHashMap.

### Задачи:
1. Создайте ConcurrentHashMap и добавьте в нее элементы в многопоточной среде (используйте несколько потоков).
2. Продемонстрируйте, как разные потоки могут безопасно добавлять и читать элементы из этой карты одновременно.
3. Сравните производительность с обычной HashMap при работе с несколькими потоками.


===
# GC

## Задание 1: Наблюдение за работой GC

### Цель:
- Понаблюдать за работой сборки мусора в Java.

### Задачи:
1. Напишите простое Java-приложение, которое интенсивно работает с памятью, например, создавая и уничтожая большое количество объектов.
2. Запустите приложение с различными сборщиками мусора (например, Serial, Parallel, G1) и с различными параметрами кучи.
3. Используйте инструменты мониторинга (например, VisualVM или jconsole) для наблюдения за процессом сборки мусора.
4. Проанализируйте результаты и сравните, как разные сборщики мусора и размеры кучи влияют на производительность приложения.

## Задание 2: Изучение GC Roots

### Цель:
- Понять концепцию GC Roots в контексте сборки мусора.

### Задачи:
1. Напишите код, в котором явно создаются GC Roots (например, локальные переменные и статические поля).
2. Сгенерируйте достаточное количество объектов, чтобы инициировать сборку мусора.
3. Продемонстрируйте, как GC Roots используются для определения достижимых объектов.
4. Опционально: используйте инструменты для профилирования памяти, чтобы визуализировать GC Roots и собираемые объекты.

## Задание 3: Работа с разными типами ссылок

### Цель:
- Изучить влияние разных типов ссылок на процесс сборки мусора.

### Задачи:
1. Создайте примеры с использованием strong, soft, weak и phantom ссылок.
2. Продемонстрируйте, как сборка мусора ведет себя по-разному для объектов, на которые ссылаются разные типы ссылок.
3. Продемонстрируйте ситуацию, в которой soft или weak ссылки могут помочь избежать исключения OutOfMemoryError.
4. Объясните, в каких ситуациях целесообразно использовать каждый из этих типов ссылок.

Эти задания позволят оценить знание кандидатом механизмов управления памятью в Java и способность применять это знание на практике.


===
# Multithreading 

## Задание 1: Основы создания и запуска потоков

### Цель:
- Понять, как создавать и управлять потоками в Java.

### Задачи:
1. Создайте класс, который расширяет Thread, и в его методе run() добавьте вывод сообщений в консоль с интервалами в 1 секунду.
2. Создайте класс, который реализует интерфейс Runnable, и повторите аналогичные действия.
3. В методе main() создайте и запустите несколько экземпляров каждого типа потоков.
4. Объясните разницу в поведении методов start() и run() на основе вашего кода.

## Задание 2: Синхронизация потоков

### Цель:
- Изучить механизмы синхронизации в многопоточных приложениях.

### Задачи:
1. Создайте простой банковский счет, представленный классом с операциями внесения и снятия денег.
2. Реализуйте эти операции таким образом, чтобы они были потокобезопасными.
3. Создайте несколько потоков, которые будут одновременно вносить и снимать деньги со счета.
4. Используйте synchronized блоки для обеспечения атомарности операций с балансом.

## Задание 3: Использование ExecutorService

### Цель:
- Практически изучить работу с пулами потоков через ExecutorService.

### Задачи:
1. Создайте фиксированный пул потоков с помощью Executors.
2. Напишите задачу, которая принимает параметр и печатает его в консоль.
3. Отправьте несколько задач в созданный пул и наблюдайте за их выполнением.
4. Попробуйте остановить ExecutorService и проанализируйте поведение программы.

===
# GoF Patterns

## Задание 1: Реализация паттерна Стратегия (Strategy)

### Цель:
- Понять и реализовать паттерн Стратегия.

### Задачи:
1. Создайте интерфейс `SortingStrategy` с методом `sort`, который принимает список и возвращает его отсортированный.
2. Реализуйте несколько стратегий сортировки (например, сортировку пузырьком и быструю сортировку), используя этот интерфейс.
3. В клиентском коде демонстрируйте смену стратегий сортировки без изменения остальной части кода.

## Задание 2: Применение паттерна Декоратор (Decorator)

### Цель:
- Изучить и реализовать паттерн Декоратор.

### Задачи:
1. Создайте базовый интерфейс `Coffee` с методом `getCost`.
2. Реализуйте класс `SimpleCoffee`, представляющий простой кофе.
3. Создайте абстрактный декоратор `CoffeeDecorator`, который реализует интерфейс `Coffee` и содержит ссылку на декорируемый объект кофе.
4. Реализуйте конкретные декораторы (например, `MilkCoffeeDecorator` и `SugarCoffeeDecorator`), добавляющие ингредиенты и изменяющие стоимость кофе.
5. В демонстрационном коде создайте кофе с различными комбинациями добавок.

## Задание 3: Использование паттерна Фабричный метод (Factory Method)

### Цель:
- Понять и применить паттерн Фабричный метод.

### Задачи:
1. Создайте абстрактный класс `Dialog`, который предоставляет метод `createButton`.
2. Реализуйте конкретные классы `WindowsDialog` и `LinuxDialog`, которые создают соответствующие конкретные объекты кнопок.
3. Определите интерфейс `Button` с методом `render`, и создайте несколько конкретных реализаций этого интерфейса (`WindowsButton`, `LinuxButton`).
4. В методе main демонстрируйте создание различных диалогов в зависимости от условий и вызовите метод `render` для созданных кнопок.


===
# Enterprise patterns

## Задание 1: Реализация паттерна Data Access Object (DAO)

### Цель:
- Понять и реализовать паттерн DAO.

### Задачи:
1. Создайте простую модель данных, например, класс `User` с несколькими полями.
2. Разработайте интерфейс `UserDao` с методами для CRUD операций (создание, чтение, обновление, удаление).
3. Реализуйте `UserDao` с использованием коллекции (например, `HashMap`) в качестве хранилища данных.
4. В демонстрационном коде продемонстрируйте использование DAO для работы с данными пользователя.

## Задание 2: Применение паттерна Service Layer

### Цель:
- Изучить и применить паттерн Service Layer.

### Задачи:
1. Используя созданную модель `User` и `UserDao`, реализуйте класс `UserService`, который будет предоставлять высокоуровневые операции с пользователями.
2. В `UserService` добавьте методы для обработки бизнес-логики, например, регистрации или аутентификации пользователя.
3. Покажите в демонстрационном коде, как клиентский код взаимодействует с `UserService`, а не напрямую с `UserDao`.

## Задание 3: Создание и использование Transfer Object (Value Object)

### Цель:
- Понять принцип работы и применение паттерна Transfer Object.

### Задачи:
1. Определите класс `UserDto` (Data Transfer Object для `User`), который будет использоваться для передачи данных пользователя между слоями приложения.
2. В `UserService` создайте метод для получения деталей пользователя, который возвращает `UserDto`, а не сущность `User`.
3. В демонстрационном коде продемонстрируйте, как клиент может использовать `UserDto` для чтения, но не для изменения данных пользователя.


===
# SOLID

## Задание 1: Применение принципа единственной ответственности (SRP)

### Цель:
- Иллюстрировать и реализовать принцип единственной ответственности.

### Задачи:
1. Создайте класс `ReportGenerator`, который в текущей реализации отвечает и за подготовку данных, и за их вывод в различных форматах (например, HTML и PDF).
2. Рефакторинг: разделите ответственности, создав отдельные классы для подготовки данных (`ReportDataPreparer`) и их вывода (`ReportPresenter` с подклассами `HtmlReportPresenter` и `PdfReportPresenter`).
3. Продемонстрируйте в демонстрационном коде, как измененный дизайн упрощает расширение и поддержку кода.

## Задание 2: Реализация принципа открытости/закрытости (OCP)

### Цель:
- Показать практическое применение принципа открытости/закрытости.

### Задачи:
1. Создайте класс `DiscountCalculator` для расчета скидки на продукт, который в текущей реализации требует изменений в коде при добавлении новых типов скидок.
2. Рефакторинг: измените дизайн, используя полиморфизм для поддержки различных типов скидок без изменения существующего кода.
3. Добавьте несколько конкретных стратегий скидок и продемонстрируйте их использование в `DiscountCalculator` без необходимости его изменения.

## Задание 3: Применение принципа разделения интерфейса (ISP)

### Цель:
- Понять и применить принцип разделения интерфейса.

### Задачи:
1. Создайте интерфейс `MultiFunctionDevice` с методами для печати, сканирования и отправки факсов.
2. Рефакторинг: вместо одного "тяжеловесного" интерфейса создайте несколько специализированных интерфейсов (`Printer`, `Scanner`, `Fax`) и измените дизайн так, чтобы устройства могли реализовывать только необходимые им функции.
3. Продемонстрируйте, как разделение интерфейса улучшает гибкость и поддерживаемость кода, позволяя создавать устройства с различными функциональностями.


===
# RDBMS

## Задание 1: Работа с транзакциями через JDBC

### Цель:
- Понять и реализовать управление транзакциями в Java с использованием JDBC.

### Задачи:
1. Создайте простую таблицу в базе данных (например, `users` с полями `id`, `name`, `email`).
2. Напишите Java-приложение, которое использует JDBC для вставки данных в таблицу.
3. В вашем приложении реализуйте пример транзакции, которая включает в себя несколько операций вставки и откатывается при возникновении ошибки.
4. Продемонстрируйте, что при возникновении ошибки в одной из операций, все предыдущие изменения отменяются.

## Задание 2: Использование JPA для взаимодействия с базой данных

### Цель:
- Изучить основы работы с JPA для взаимодействия с RDBMS.

### Задачи:
1. Создайте простой класс сущности (например, `User` с полями `id`, `name`, `email`).
2. Используйте JPA для сохранения, извлечения, обновления и удаления объектов `User` в базе данных.
3. Продемонстрируйте, как JPA упрощает работу с RDBMS по сравнению с прямым использованием JDBC.

## Задание 3: Управление транзакциями в Spring Framework

### Цель:
- Освоить управление транзакциями в приложении на Spring.

### Задачи:
1. Создайте простое Spring-приложение, в котором определен компонент для работы с данными (например, `UserService`).
2. Используйте аннотацию `@Transactional` для управления транзакциями на уровне методов `UserService`.
3. Создайте демонстрационный сценарий, в котором `UserService` выполняет несколько операций с базой данных в рамках одной транзакции.
4. Продемонстрируйте, как Spring обеспечивает управление транзакциями и как это влияет на упрощение кода и повышение его надежности.

===
# Spring Core

## Задание 1: Основы конфигурации Spring и создание бинов

### Цель:
- Изучить процесс конфигурации Spring и способы создания бинов.

### Задачи:
1. Создайте простой Spring проект и определите в нем несколько бинов разных типов (например, компоненты, сервисы, репозитории).
2. Используйте различные способы конфигурации: аннотации (`@Component`, `@Service` и т.д.) и Java-based конфигурацию (`@Configuration` и `@Bean`).
3. Продемонстрируйте внедрение зависимостей с использованием `@Autowired`.
4. Выведите в консоль информацию о созданных бинах, используя ApplicationContext.

## Задание 2: Управление жизненным циклом бина в Spring

### Цель:
- Понять и продемонстрировать управление жизненным циклом бина в Spring.

### Задачи:
1. Создайте бин с использованием аннотаций, определите для него методы инициализации и уничтожения.
2. Измените область видимости бина на "prototype" и продемонстрируйте разницу в управлении жизненным циклом по сравнению с "singleton".
3. В демонстрационном коде покажите, как Spring вызывает методы инициализации и уничтожения для бина.

## Задание 3: Аспектно-ориентированное программирование (AOP) в Spring

### Цель:
- Изучить и применить AOP в Spring.

### Задачи:
1. Создайте простой сервис с несколькими методами (например, для логирования, валидации, транзакций).
2. Определите аспект, который логирует время выполнения каждого метода сервиса.
3. Примените аспект к сервису с использованием аннотаций.
4. В демонстрационном коде покажите, как аспект влияет на выполнение методов сервиса и как он помогает сократить дублирование кода.

===
# Hibernate

## Задание 1: Основы работы с Hibernate

### Цель:
- Изучить базовые принципы работы с Hibernate.

### Задачи:
1. Создайте простую сущность (например, `User` с полями `id`, `name`, `email`).
2. Настройте Hibernate Configuration File (hibernate.cfg.xml) для подключения к вашей базе данных.
3. Реализуйте базовые операции CRUD для сущности `User`, используя сессию Hibernate.
4. Продемонстрируйте использование HQL для выполнения запросов к базе данных на примере выборки пользователей по определенному критерию.

## Задание 2: Использование маппинга и ассоциаций в Hibernate

### Цель:
- Понять механизмы маппинга и ассоциаций в Hibernate.

### Задачи:
1. Создайте две связанные сущности (например, `User` и `Address`, со связью One-to-One).
2. Настройте маппинг сущностей с использованием аннотаций.
3. Реализуйте операции добавления, изменения и удаления для этих сущностей, учитывая их связь.
4. Продемонстрируйте выполнение операций с учетом установленных ассоциаций.

## Задание 3: Кэширование и оптимизация в Hibernate

### Цель:
- Изучить принципы кэширования и возможности оптимизации в Hibernate.

### Задачи:
1. Настройте вторичный кэш (например, EHCache) в Hibernate.
2. Модифицируйте конфигурацию и сущности для использования кэширования.
3. Реализуйте пример, демонстрирующий эффективность кэширования (например, повторные запросы к одним и тем же данным без их изменения).
4. Продемонстрируйте различия в производительности с включенным и отключенным кэшированием.

Эти задания позволят оценить понимание кандидатом фреймворка Hibernate, его основных концепций и способность оптимизировать работу приложения.


===
# Java Troubleshooting

## Задание 1: Устранение утечек памяти

### Цель:
- Научиться отслеживать и устранять утечки памяти в Java-приложениях.

### Задачи:
1. Создайте простое Java-приложение, в котором намеренно вызывается утечка памяти (например, через коллекцию, к которой постоянно добавляются объекты, но из которой они не удаляются).
2. Используйте инструменты профилирования (например, VisualVM) для мониторинга потребления памяти вашим приложением.
3. Идентифицируйте утечку памяти и модифицируйте код для ее устранения.
4. Повторно проанализируйте приложение, чтобы убедиться, что утечка памяти устранена.

## Задание 2: Анализ и устранение Deadlock

### Цель:
- Научиться определять и исправлять проблемы блокировки потоков (deadlock).

### Задачи:
1. Создайте многопоточное Java-приложение, в котором происходит deadlock между потоками.
2. Используйте инструменты для анализа состояния потоков (например, jstack) для идентификации deadlock.
3. Модифицируйте код приложения для устранения deadlock.
4. Повторно проанализируйте приложение, чтобы убедиться в отсутствии deadlock.

## Задание 3: Оптимизация работы сборщика мусора

### Цель:
- Изучить и оптимизировать работу сборщика мусора в Java-приложении.

### Задачи:
1. Создайте Java-приложение, которое испытывает затруднения с производительностью из-за частых сборок мусора.
2. Настройте параметры JVM и сборщика мусора для оптимизации его работы.
3. Используйте инструменты мониторинга (например, jstat, VisualVM) для анализа эффективности сборщика мусора после внесенных изменений.
4. Сравните производительность приложения до и после оптимизации работы сборщика мусора.

