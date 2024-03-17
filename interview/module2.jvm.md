# JVM

## Что такое JVM и зачем она нужна?

===

JVM (Java Virtual Machine) - это виртуальная машина, которая выполняет байт-код Java. Она является ключевой частью платформы Java и используется для запуска Java-приложений. Вот основные причины, по которым JVM необходима:

1. Платформенная независимость: Одним из главных преимуществ Java является то, что приложения, написанные на Java, могут быть запущены на различных операционных системах без изменений их исходного кода. Это достигается благодаря тому, что Java-программы компилируются в байт-код, который затем выполняется JVM. Таким образом, JVM обеспечивает абстракцию от операционной системы.

2. Управление памятью и выполнение кода: JVM отвечает за управление памятью, выделение и освобождение памяти, а также выполнение байт-кода Java. Она следит за динамическим выделением памяти, выполнением потоков и многими другими аспектами выполнения приложения.

3. Гарантированное выполнение: JVM обеспечивает надежное и контролируемое выполнение Java-приложений. Она предотвращает доступ к неправильной памяти, обеспечивает безопасность и защиту от вредоносных действий.

4. Управление многопоточностью: Java поддерживает многопоточное программирование, и JVM предоставляет механизмы для управления потоками исполнения. Она позволяет разработчикам создавать многопоточные приложения, обеспечивая безопасность и синхронизацию потоков.

5. Оптимизация и улучшение производительности: JVM включает в себя различные механизмы оптимизации кода, такие как динамическая компиляция, адаптивная оптимизация и т.д. Это позволяет улучшить производительность выполнения Java-приложений.

В целом, JVM играет ключевую роль в обеспечении эффективного и надежного выполнения Java-приложений на различных платформах, обеспечивая платформенную независимость, управление памятью, безопасность и производительность.

===

## Объясните, как работает JVM.

===

1. Загрузка классов: Прежде чем выполнение Java-приложения начнется, JVM должна загрузить классы, необходимые для его выполнения. Загрузка классов происходит из файлов .class, содержащих скомпилированный байт-код.

2. Проверка байт-кода: После загрузки классов JVM проверяет байт-код на соответствие семантике Java и на наличие потенциальных ошибок безопасности. Это делается для предотвращения выполнения вредоносного или неправильного кода.

3. Интерпретация и компиляция: Интерпретация байт-кода является одним из методов исполнения Java-приложений. JVM может использовать интерпретацию для немедленного выполнения байт-кода без его предварительной компиляции. Однако для повышения производительности JVM также использует динамическую компиляцию. В этом случае части байт-кода, которые часто выполняются, компилируются в машинный код, что ускоряет их выполнение.

4. Управление памятью: JVM отвечает за управление памятью, выделение и освобождение памяти для объектов, созданных во время выполнения приложения. Она использует механизмы сборки мусора для автоматического освобождения памяти, занятой объектами, которые больше не используются.

5. Управление потоками: JVM поддерживает выполнение многопоточных Java-приложений, обеспечивая управление потоками исполнения, синхронизацию доступа к общим ресурсам и обработку исключений в многопоточной среде.

6. Оптимизация кода: JVM выполняет различные оптимизации кода во время его выполнения, такие как инлайнинг, оптимизация циклов, удаление недостижимого кода и другие, чтобы повысить производительность приложения.

===

## Какие основные компоненты JVM вы знаете?

===

1. Класс-лоадеры (Class Loaders): Они отвечают за загрузку классов в JVM во время выполнения программы. Класс-лоадеры динамически загружают классы по мере необходимости и ищут их в различных источниках, таких как файловая система, сеть и т. д.

2. Runtime Data Area: Это область памяти, выделенная для выполнения программы Java. Runtime Data Area включает в себя:
    * Method Area: Это область памяти, где хранится информация о классах и методах, включая код методов.
    * Heap: Это область памяти, где хранятся объекты и массивы, созданные во время выполнения программы Java.
    * Java Stack: Это область памяти, где хранятся локальные переменные и стек вызовов для каждого потока выполнения.
    * PC Register: Это регистр, который хранит адрес текущей инструкции, выполняемой потоком выполнения.
    * Native Method Stack: Это область памяти для выполнения нативных (не-Java) методов.
3. Execution Engine: Это компонент, который интерпретирует байткод Java или компилирует его в машинный код для исполнения на целевой платформе. Execution Engine включает в себя интерпретатор и JIT-компилятор (Just-In-Time Compiler).

===

## Что такое байт-код в контексте Java?

===

Байт-код в контексте Java - это промежуточный язык, который создается компилятором Java при компиляции исходного кода Java. Вместо того чтобы создавать непосредственно машинный код, который может быть исполнен на конкретной аппаратной платформе, компилятор Java генерирует байт-код, который исполняется на виртуальной машине Java (JVM - Java Virtual Machine).

Байт-код Java представляет собой набор инструкций, которые могут быть поняты и выполнены JVM. Он называется "байт-кодом", потому что каждая инструкция в языке Java представляется одним или несколькими байтами. Этот формат сжат и эффективен для передачи и хранения.

Преимущества использования байт-кода включают в себя:
* Переносимость: Байт-код может быть выполнен на любой платформе, на которой есть реализация JVM.
* Безопасность: Байт-код исполняется в контролируемой среде виртуальной машины, что уменьшает риск возникновения уязвимостей безопасности.
* Эффективность: Байт-код может быть компилирован в машинный код с использованием JIT-компилятора, что повышает производительность приложений.
Примеры инструкций байт-кода включают загрузку, хранение и операции с переменными, вызов методов, управление потоком выполнения и многое другое.

===

## Как JVM управляет памятью?

===

JVM управляет памятью автоматически для объектов, созданных во время выполнения Java-программы. Вот основные механизмы управления памятью в JVM:

Heap (Куча): Это область памяти, где хранятся все объекты Java, созданные во время выполнения программы. Куча разделяется между всеми потоками выполнения программы. Память в куче выделяется автоматически при создании новых объектов с помощью оператора new.

Сборка мусора (Garbage Collection): Это процесс, при котором JVM автоматически освобождает память, которая больше не используется объектами вашей программы. Сборка мусора обнаруживает и удаляет объекты, на которые больше нет ссылок из памяти. Это позволяет избежать утечек памяти и эффективно использовать ресурсы.

Модель жизненного цикла объекта: JVM использует модель жизненного цикла объекта для определения, когда объект может быть удален из памяти. Объекты Java проходят через различные этапы жизненного цикла, такие как создание, использование и уничтожение. Сборщик мусора обнаруживает объекты, находящиеся в состоянии "недостижимости", то есть объекты, на которые не существует ссылок из других объектов, и освобождает память, занимаемую этими объектами.

Управление памятью в куче: JVM использует различные алгоритмы управления памятью для эффективного распределения и освобождения памяти в куче. Это включает в себя алгоритмы выделения памяти, такие как аллокация сброса (bump allocation), разделение и объединение (splitting and merging), а также различные стратегии сборки мусора, такие как сборка мусора по поколениям (generational garbage collection) и кард-маркировочный алгоритм (card-marking algorithm).

Благодаря этим механизмам управления памятью JVM обеспечивает эффективное использование памяти и избегает утечек памяти в Java-приложениях.

===

## Что такое сборка мусора (Garbage Collection) в JVM и как она работает?

===

1. Обнаружение недостижимых объектов: Сборщик мусора определяет, какие объекты в куче больше не могут быть доступны вашей программой. Объект считается "недостижимым", если на него не существует ссылок из других объектов, или если все ссылки на него были удалены или потеряны.
2. Маркировка недостижимых объектов: Сборщик мусора маркирует недостижимые объекты как кандидаты на удаление. Для этого обычно используется алгоритм "поиск по графу". Он начинает с набора "корневых" объектов (например, глобальных переменных, статических переменных и активных потоков выполнения) и рекурсивно обходит граф объектов, маркируя те, которые они достижимы. Все объекты, которые не были маркированы, считаются недостижимыми.
3. Освобождение памяти: После маркировки недостижимых объектов сборщик мусора освобождает память, занимаемую этими объектами. Это достигается путем компактирования памяти или освобождения блоков памяти, занятых недостижимыми объектами.
4. Восстановление ресурсов: Освобожденная память становится доступной для новых объектов и может быть повторно использована для следующих выделений памяти в куче.

===

## Объясните разницу между JIT компилятором и интерпретатором.

===

Интерпретатор:
* Выполнение кода: Интерпретатор выполняет исходный код программы непосредственно по одной инструкции за раз. Каждая инструкция интерпретируется и преобразуется в соответствующие операции, которые выполняются на реальном или виртуальном процессоре.
* Преимущества: Интерпретация обеспечивает быстрый запуск программы, поскольку не требуется предварительной компиляции. Это также обеспечивает переносимость, так как интерпретатор может работать на разных аппаратных платформах без изменений в исходном коде.
* Недостатки: Однако интерпретация может быть медленной по сравнению с выполнением нативного машинного кода, поскольку каждая инструкция должна интерпретироваться на лету. Это может привести к снижению производительности программы, особенно для длительных или вычислительно интенсивных задач.

JIT-компилятор:
* Компиляция кода: JIT-компилятор работает по принципу компиляции исходного кода в машинный код (или другой формат кода, более близкий к машинному), который может быть непосредственно выполнен процессором. JIT-компилятор анализирует и компилирует части кода, которые часто выполняются (например, методы), во время выполнения программы.
* Преимущества: Это позволяет увеличить производительность программы, так как скомпилированный код выполняется намного быстрее, чем интерпретируемый. Также JIT-компиляция может проводить оптимизации кода, улучшая его эффективность.
* Недостатки: Однако JIT-компиляция требует дополнительного времени и ресурсов во время запуска программы для анализа и компиляции кода. Это может привести к небольшой задержке перед выполнением программы.

===

## Какие существуют типы загрузчиков классов (class loaders) в JVM?

===

Загрузчик классов "Bootstrap":
* Это первичный загрузчик классов, который загружает базовые классы Java (например, из пакета java.lang.*) из системных библиотек Java (обычно из директории jre/lib или аналогичной).
* Этот загрузчик реализован внутри JVM и обычно написан на низкоуровневых языках, таких как C или C++.

Расширенный загрузчик классов (Extension Class Loader):
* Этот загрузчик загружает классы из директории расширений Java (например, из директории jre/lib/ext).
* Обычно расширенный загрузчик классов является дочерним по отношению к загрузчику Bootstrap.

Приложенный (или системный) загрузчик классов (Application/System Class Loader):
* Этот загрузчик загружает классы из путей, указанных в переменной окружения CLASSPATH или в опции командной строки -classpath.
* Он также загружает классы из текущего рабочего каталога приложения.
* Приложенный загрузчик классов является дочерним по отношению к расширенному загрузчику классов.

Пользовательские загрузчики классов (Custom Class Loaders):
* Эти загрузчики определяются пользователем и расширяют функциональность стандартных загрузчиков классов.
* Пользовательские загрузчики классов могут загружать классы из произвольных источников, таких как файловая система, сеть, базы данных и т. д.
* Они позволяют создавать собственные стратегии загрузки классов, что может быть полезно, например, для реализации механизмов динамической загрузки или модульной системы.

===

## Что такое Java Memory Model?

===

Java Memory Model (JMM) - это спецификация, определяющая правила и гарантии взаимодействия между потоками выполнения в многопоточных Java-приложениях. Она определяет, как операции чтения и записи разделяемых переменных между потоками происходят в многопоточной среде, а также какие виды гарантий предоставляются программисту в отношении видимости этих операций.

Вот основные концепции и правила, определенные в Java Memory Model:
1. Atomicity (Атомарность): Операции чтения и записи переменных кроме long и double являются атомарными, в то время как операции чтения и записи переменных long и double могут быть разбиты на более мелкие шаги.
2. Visibility (Видимость): Java Memory Model гарантирует, что изменения, внесенные в разделяемые переменные одним потоком, будут видны другим потокам, которые считывают эти переменные. Это осуществляется путем использования синхронизации и правил, связанных с мониторами и блокировками.
3. Ordering (Упорядочение): JMM определяет правила относительно порядка операций чтения и записи в потоках выполнения. Например, если один поток записывает значение в разделяемую переменную, а затем другой поток читает это значение, JMM гарантирует, что второй поток увидит записанное значение, а не более раннее значение или изменения после этого.
4. Happens-Before Relationship (Отношение "происходит-до"): Это концепция, определяющая отношение "происходит-до" между операциями в потоках выполнения. Если операция A происходит-до операции B, то все изменения, внесенные операцией A, будут видны операции B. Это обеспечивает гарантии согласованного поведения в многопоточных программах.

===

## Какие вы знаете флаги JVM для настройки работы с памятью и производительности?

===

Управлять metaspace областью можно с помощью следующих флагов JVM:
* -XX:MetaspaceSize - минимальный объём памяти для области
* -XX:MaxMetaspaceSize - максимальный объём памяти для области
* -XX:MinMetaspaceFreeRatio - минимально зарезервированный размер памяти после очистки GC (в процентах)
* -XX:MaxMetaspaceFreeRatio - максимально зарезервированный размер памяти после очистки GC (в процентах)

Управлять heap областью можно с помощью следующих флагов JVM:
* -Xms - минимальный объём памяти всей области
* -Xmx - максимальный объём памяти всей области
* -XX:NewSize - минимальный объём памяти Eden сегмента
* -XX:MaxNewSize - максималный объём памяти Eden сегмента
* -XX:SurvivorRatio - соотношение между объёмами памяти Eden и Survival сегментов

Управление GC:
* -XX:+UseG1GC - Включает использование Garbage-First (G1) сборщика мусора. G1GC является сборщиком мусора, который разработан для улучшения производительности и предсказуемости при работе с большими кучами
* -XX:+UseConcMarkSweepGC: Включает использование сборщика мусора Concurrent Mark-Sweep (CMS). Этот сборщик мусора предназначен для уменьшения пауз сборки мусора в больших кучах.
* -XX:ParallelGCThreads: Определяет количество потоков, используемых параллельными сборщиками мусора (Parallel GC).
* -XX:+UnlockExperimentalVMOptions -XX:+UseZGC: Включает использование экспериментального сборщика мусора ZGC, который разработан для обеспечения низкой латентности и высокой производительности на очень больших кучах.

===

## Как можно мониторить и управлять производительностью JVM?

===

1. JConsole: JConsole - это графический инструмент мониторинга и управления, поставляемый вместе с JDK. Он позволяет отслеживать различные характеристики JVM, такие как использование памяти, потребление CPU, загрузка классов, сборка мусора и другие. Также JConsole позволяет управлять некоторыми аспектами JVM, такими как запуск сборки мусора и принудительное сборка. Для использования JConsole необходимо запустить Java-приложение с включенным JMX-агентом (Java Management Extensions).

2. VisualVM: VisualVM - это другой графический инструмент мониторинга и управления JVM, который также поставляется вместе с JDK. Он предоставляет расширенные возможности мониторинга и профилирования, включая анализ использования памяти, процессора и потоков, а также профилирование производительности и анализ утечек памяти.

3. JVM Tool Interface (JVM TI): JVM TI предоставляет низкоуровневый интерфейс для инструментирования и отладки JVM. Это позволяет разработчикам создавать собственные инструменты для мониторинга и управления JVM, а также производить более глубокий анализ и профилирование.

4. Утилиты командной строки: JVM также предоставляет набор утилит командной строки, таких как jstat, jmap, jstack, jcmd и jinfo, которые могут быть использованы для мониторинга и управления JVM из командной строки. Например, jstat предоставляет статистику использования памяти и производительности, jmap позволяет создавать дампы памяти и анализировать их, jstack позволяет получать информацию о стеках потоков и так далее.

5. Управление параметрами JVM: Можно использовать параметры командной строки JVM (например, флаги JVM), чтобы настроить различные аспекты работы JVM, такие как размер кучи, сборка мусора, оптимизации JIT и т. д. Это может быть полезно для оптимизации производительности и устранения проблем.

===

## Что такое стек и куча в контексте JVM?

===


В контексте Java Virtual Machine (JVM), стек (stack) и куча (heap) - это две основные области памяти, используемые для выполнения программы.

1. Стек (Stack):
    * Структура данных: Стек является структурой данных, работающей по принципу LIFO (Last In, First Out). Это означает, что последний элемент, помещенный в стек, будет первым, который будет извлечен.
    * Использование: В стеке хранятся локальные переменные и данные, связанные с вызовами методов. Каждый поток выполнения в JVM имеет свой собственный стек вызовов, который используется для хранения контекста выполнения методов (локальные переменные, параметры метода, возвратные адреса и т. д.).
    * Жизненный цикл данных: Данные в стеке удаляются после завершения выполнения метода, для которого они были созданы.

2. Куча (Heap):
    * Структура данных: Куча представляет собой область памяти, где хранятся объекты и массивы, созданные во время выполнения программы Java.
    * Использование: В куче размещаются динамические объекты, которые не имеют фиксированного размера и не привязаны к времени жизни методов. Объекты в куче создаются с использованием оператора new и могут быть доступны из различных частей программы.
    * Жизненный цикл данных: Объекты в куче остаются в памяти до тех пор, пока на них есть ссылки. Когда объект больше не используется (то есть на него нет активных ссылок из кода программы), он становится кандидатом на сборку мусора и может быть удален при следующей сборке мусора.

===

## Как JVM обрабатывает исключения?

===

1. Бросание исключения (Throwing Exceptions):
Когда возникает исключительная ситуация во время выполнения программы (например, деление на ноль или обращение к несуществующему объекту), код может сгенерировать объект исключения, используя ключевое слово throw.

2. Перехват исключения (Catching Exceptions):
Исключения могут быть перехвачены с помощью конструкции try-catch. Когда блок try выполнится, JVM будет искать соответствующий блок catch для обработки возможного исключения.

3. Обработка исключения (Handling Exceptions):
Если в блоке try происходит исключение, управление передается соответствующему блоку catch, который может обработать исключение или выполнить другие действия.

4. Поиск обработчика (Searching for Exception Handler):
В JVM ищется соответствующий обработчик исключения, начиная с текущего метода и вверх по стеку вызовов методов. Если обработчик исключения не найден в текущем методе, JVM расширяет поиск к методу, который вызвал текущий метод, и так далее, пока не будет найден подходящий обработчик или пока не достигнется точка входа в программу.

5. Создание стека исключения (Creating Exception Stack Trace):
В случае, если исключение не было обработано, JVM создает объект стека вызовов исключения (Exception Stack Trace), который содержит информацию о месте возникновения исключения, а также о вызывающих методах.

6. Прекращение выполнения (Termination):
Если исключение не было обработано, выполнение программы прекращается, и информация об исключении выводится в консоль или в лог.

===

## В чем разница между JVM, JRE и JDK?

===

1. JVM (Java Virtual Machine):
    * Определение: Это виртуальная машина, которая выполняет байт-код Java (Java bytecode), созданный компилятором Java, на реальном компьютере или сервере.
    * Функции: JVM обеспечивает среду выполнения для Java-программ, переводя байт-код Java в машинный код, который может быть исполнен на конкретной платформе. Он также управляет памятью, управляет потоками выполнения и обеспечивает другие важные функции, необходимые для работы программы.
    * Примеры: Некоторые известные реализации JVM включают Oracle HotSpot JVM, OpenJ9 от Eclipse Foundation и другие.

2. JRE (Java Runtime Environment):
    * Определение: Это минимальный набор компонентов, необходимых для выполнения Java-приложений. Включает в себя JVM, стандартные библиотеки Java и другие компоненты.
    * Функции: JRE предоставляет среду выполнения для Java-приложений, но не включает компилятор Java и другие инструменты разработки.
    * Примеры: Oracle JRE, OpenJDK JRE и другие реализации.

3. JDK (Java Development Kit):
    * Определение: JDK - это полный комплект инструментов разработки для создания Java-приложений. Он включает в себя JRE, компилятор Java (javac), набор инструментов для отладки, документации и другие утилиты.
    * Функции: JDK предоставляет все необходимые инструменты для разработки, от создания и компиляции кода до тестирования и отладки приложений.
    * Примеры: Oracle JDK, OpenJDK JDK и другие реализации.

===

## Какие вы знаете инструменты для профайлинга и отладки приложений на JVM?

===

1. VisualVM: Это универсальный инструмент для мониторинга и анализа приложений на JVM. VisualVM предоставляет графический интерфейс для отслеживания использования памяти, процессорного времени, потоков выполнения и других аспектов работы приложения. Он также поддерживает плагины для расширения функциональности.

2. Java Mission Control (JMC): Разработанный компанией Oracle, JMC предоставляет дополнительные инструменты для мониторинга и профилирования приложений на Java. Он обеспечивает детальную информацию о работе приложения и позволяет анализировать производительность, потребление ресурсов и другие аспекты.

3. YourKit Java Profiler: Это коммерческий профилировщик для Java, который обеспечивает широкий набор инструментов для анализа производительности приложений. YourKit предоставляет возможности для отслеживания использования памяти, поиска узких мест в коде и оптимизации производительности.

4. JProfiler: Еще один коммерческий инструмент для профилирования Java-приложений. JProfiler предоставляет широкий спектр функций, включая анализ производительности, мониторинг памяти, отслеживание вызовов методов и другие возможности.

5. Eclipse MAT (Memory Analyzer Tool): Этот инструмент предназначен для анализа использования памяти в Java-приложениях. Он помогает идентифицировать и анализировать утечки памяти, определять объекты, которые занимают большой объем памяти, и предлагать рекомендации по оптимизации.

6. IntelliJ IDEA Ultimate: Платная версия IDE IntelliJ IDEA включает в себя встроенные инструменты для профилирования и отладки Java-приложений. Они позволяют анализировать производительность, отслеживать использование памяти и проводить отладку кода.

===

## Что такое класс ClassLoader и какова его роль?

===

ClassLoader в Java - это класс, который загружает классы в Java во время выполнения программы. Он является частью Java Runtime Environment (JRE) и отвечает за загрузку классов из файловой системы, сети или других источников данных в JVM.

Роль ClassLoader включает следующие аспекты:
* Загрузка классов: ClassLoader загружает классы в JVM по запросу. Когда программа обращается к классу впервые во время выполнения, ClassLoader ищет его в доступных источниках и загружает его в память.
* Динамическая загрузка: ClassLoader позволяет программам динамически загружать классы во время выполнения. Это особенно полезно, когда приложение должно загружать классы в зависимости от определенных условий или параметров.
* Изоляция классов: Каждый ClassLoader имеет свой собственный пространство имен для загруженных классов. Это позволяет изолировать классы одного приложения от других классов и предотвращает конфликты имен.
* Динамическая перезагрузка: ClassLoader поддерживает возможность динамической перезагрузки классов. Это означает, что классы могут быть перезагружены во время выполнения без остановки приложения. Это может быть полезно при разработке и тестировании приложений.
* Системные и пользовательские классы: ClassLoader загружает как системные (стандартные библиотеки Java), так и пользовательские классы. Это позволяет использовать различные библиотеки и расширения в Java-приложениях.

===

## Какие параметры запуска JVM вы знаете и для чего они используются?

===

см. [вопрос](#какие-вы-знаете-флаги-jvm-для-настройки-работы-с-памятью-и-производительности)

* cp - classpath, пути в которых java ищет class файлы и другие ресурсы (в том числе lsFusion модули). По умолчанию равен . - текущая папка

* Xshareclasses - общий доступ к данным класса в общем кэше классов. JVM подключается к существующему кэшу или создает кэш, если он не существует. У вас может быть несколько кэшей, и вы можете указать правильный кэш, добавив подопцию в опцию -Xshareclasses

* -verbose:gc - регистрирует, запуски сборщика мусора и сколько времени они занимают.  
-XX:+PrintGCDetails - включает в себя данные из -verbose:gc, но также добавляет информацию о размере нового поколения и более точных временных параметрах.  
-XX:-PrintGCTimeStamps - печатать метки времени при сборке мусора.

* -XX:+HeapDumpOnOutOfMemoryError - Эта опция JVM создает дамп стека, когда ваша JVM завершается с ошибкой OutOfMemory. Там нет никаких затрат, если ошибка OutOfMemory действительно не происходит. Этот флаг является обязательным для производственных систем, поскольку обычно это единственный способ глубоко определить проблему.  
Дамп кучи будет установлен в "текущем каталоге" JVM по умолчанию. Если вы хотите создать дамп кучи в определенном каталоге, запустите  
-XX:HeapDumpPath=[путь к каталогу дампа кучи]  
-XX:+UseGCOverheadLimit  
-XX:OnOutOfMemoryError=`"<cmd args>; <cmd args>"`

* -XX:+TraceClassLoading и -XX:+TraceClassUnloading - это две опции JVM, которые мы используем для печати информации журналов всякий раз, когда классы загружаются в JVM или выгружаются из JVM. Эти флаги JVM полезны, если у вас есть какой-либо тип утечки памяти, связанный с загрузчиком классов и есть подозрение, что классы не выгружаются или не собирается мусор.

* -Xbootclasspath определяет записи classpath, которые мы хотим загрузить без проверки

* -Xprof  
-Xrunhprof  
Профилирование  
Java профилирование - это процесс мониторинга различных параметров уровней JVM, таких как выполнение методов, выполнение потоков, сборка мусора и создание объектов. Java профилирование обеспечивает более точное представление о выполнении целевого приложения и использовании его ресурсов.

* d. В среде ОС, в которой установлены 32- и 64-разрядные пакеты, JVM автоматически выбирает 32-разрядные пакеты среды по умолчанию.

Если мы хотим установить 64-битную среду вручную, мы можем сделать это с помощью параметра -d . OS bit может быть 32 или 64.


===

## Какие изменения в JVM были внедрены в последних версиях Java?

===

1. Epsilon GC: В Java 11 был представлен экспериментальный сборщик мусора Epsilon, который фактически отключает сборку мусора. Это было сделано для целей тестирования производительности и исследований.
2. ZGC (Z Garbage Collector): В Java 11 также был представлен новый сборщик мусора ZGC, разработанный для больших куч и высокой производительности. Это один из сборщиков мусора с низкой латентностью.
3. Shenandoah GC: В Java 12 был добавлен еще один сборщик мусора с низкой латентностью, известный как Shenandoah GC. Он также предназначен для работы с большими кучами и минимизации пауз приложения.
4. Flight Recorder и Mission Control: В Java 11 были перенесены в открытый исходный код многие инструменты мониторинга, такие как Flight Recorder (JFR) и Mission Control.
5. JEP 341: Default CDS Archives: В Java 13 была добавлена возможность создания архивов классов (CDS) по умолчанию. Это позволяет ускорить время запуска приложения путем предварительной загрузки классов из архива.
6. JEP 358: Helpful NullPointerExceptions: Java 14 представил улучшенные и более информативные сообщения о NullPointerException, что делает их легче отслеживать и исправлять.
7. JEP 370: Foreign-Memory Access API (Incubator): Java 14 представил API доступа к внешней памяти, предназначенный для улучшения производительности при работе с нативной памятью.
8. JEP 376: ZGC: Concurrent Thread-Stack Processing: Java 15 внес улучшения в ZGC, такие как обработка стека потока во время его выполнения, что сокращает паузы сборки мусора.
9. JEP 376: Hidden Classes: В Java 15 были представлены скрытые классы, которые не могут быть ссылками из других классов за пределами своего пакета.
10. JEP 387: Elastic Metaspace: В Java 16 была внедрена возможность метаспейса изменять размер динамически, что помогает предотвратить ошибки из-за исчерпания метаспейса.
11. JEP 395: Records: Java 14 представил новый тип данных - records, который предоставляет компактный синтаксис для определения классов, предназначенных только для хранения данных.
12. JEP 411: Deprecate the Security Manager for Removal: В Java 17 был объявлен Deprecated Security Manager, что означает, что он будет удален в будущих версиях Java.

https://advancedweb.hu/a-categorized-list-of-all-java-and-jvm-features-since-jdk-8-to-21/

===

## Как JVM оптимизирует выполнение программы?

===

1. Just-In-Time (JIT) компиляция: Когда Java приложение запускается, его исходный код сначала компилируется в байткод. При выполнении этот байткод может быть интерпретирован JVM. Однако, JVM также использует JIT компиляцию для преобразования часто используемых участков кода (например, методов) в машинный код, что позволяет ускорить выполнение программы.
2. Инлайн-кэширование (Inline caching): JVM использует механизм инлайн-кэширования для улучшения производительности вызовов методов. Этот механизм заключается в кэшировании результатов предыдущих вызовов методов, что позволяет избежать повторных поисков и дополнительных накладных расходов при последующих вызовах.
3. Анализ и оптимизация управления памятью: JVM проводит анализ использования памяти во время выполнения и может оптимизировать работу с памятью, например, сборку мусора.
4. Удаление недостижимого кода (Dead code elimination): JVM может определять и удалять недостижимый код во время выполнения, что позволяет уменьшить объем исполняемого кода и ускорить его выполнение.
5. Специфичные оптимизации для конкретных архитектур и платформ: JVM может использовать различные оптимизации, зависящие от конкретной архитектуры и платформы, на которой выполняется приложение.
6. Уменьшение затрат на синхронизацию: JVM может оптимизировать работу с потоками и синхронизацию, например, используя тонкую блокировку (fine-grained locking) или алгоритмы оптимистической синхронизации.
7. Агрессивные оптимизации производительности: Современные версии JVM могут использовать различные агрессивные оптимизации производительности, такие как инлайнинг, развертывание циклов, разделение путей, предварительная компиляция и другие, чтобы повысить скорость выполнения кода.

===

## Что такое Native Method Interface (JNI) и для чего он используется?

===

Native Method Interface (JNI) - это интерфейс в языке программирования Java, который позволяет Java коду взаимодействовать с кодом на других языках, таких как C, C++, и т. д. JNI позволяет вызывать нативные (т.е. написанные на других языках) функции из Java кода и обратно.

JNI используется в следующих случаях:
1. Использование существующего кода: JNI позволяет использовать уже существующий код на других языках программирования в Java приложениях. Это может быть полезно, если у вас уже есть библиотека или модуль, написанный на C или C++, который вы хотите использовать в своем Java приложении.
2. Максимальная производительность: Нативные методы могут быть оптимизированы для выполнения на конкретной платформе или для выполнения специфических задач, что может привести к улучшению производительности по сравнению с эквивалентным кодом на Java.
3. Взаимодействие с низкоуровневым программным обеспечением: JNI позволяет Java приложениям взаимодействовать с низкоуровневым программным обеспечением или аппаратным обеспечением, для которого не существует соответствующих Java API.

===