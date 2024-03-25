# ReferencesExample

Запуск с -Xmx42m. Количество памяти выбрано подбором

Вывод программы:
```
Strong Reference: [B@28a418fc
Soft Reference: [B@63961c42
Weak Reference: [B@65b54208
Phantom Reference: null

Strong Reference: [B@28a418fc
Soft Reference: [B@63961c42
Weak Reference: null
Phantom Reference: null

Strong Reference: [B@28a418fc
Soft Reference: null
Weak Reference: null
Phantom Reference: null
```

С первым запуском GC были удалены объекты с phantom и weak ссылками на них. Т.к. phantom и weak ссылки никак не препятствуют удалению объектов на которые ссылаются

Затем был создан еще один большой объект и со следующим запуском GC был удален объект с soft ссылкой, так как памяти стало не хватать

Объект с сильной ссылкой никогда не будет удален (пока существует ссылка).

# PreventOutOfMemory

Пример приложения который дважды генерирует 10 гигабайт объектов

Вывод приложения:
```
Generating objects with soft references
Soft references are deleted
Generating objects with soft references
Out of memory error occurred while using strong references.
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at org.example.module6.gc.task3.PreventOutOfMemory.main(PreventOutOfMemory.java:34)
```

В первом случае на объекты ссылаются слабые ссылки, они удаляются когда памяти начинает не хватать, поэтому мы не получаем ошибку

Когда мы начинаем ссылаться на создаваемые объекты сильными ссылками, GC не может их удалить, и мы получаем ошибку

# Когда какие ссылки использовать

* Soft ссылки полезны для кэширования данных, которые могут быть удалены в случае нехватки памяти. Используем их когда хранение объекта желательно, но не обязательно
* Weak ссылки подходят для реализации слабых связей между объектами, когда объект должен быть автоматически удален после потери strong ссылок. Используем когда не хотим препятствовать удалению объекта, но хотим иметь на него ссылку
* Phantom ссылки используются для отслеживания момента, когда объект был удален, и выполнения очистки ресурсов, связанных с этим объектом, после его удаления.
