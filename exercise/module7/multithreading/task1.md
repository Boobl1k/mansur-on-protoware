Вывод программы:

```
ExtendedThread is running...
ExtendedThread is running...
Continuing executing method main
All threads started
RunnableTask is running...
RunnableTask is running...
RunnableTask is running...
ExtendedThread is running...
ExtendedThread is running...
RunnableTask is running...
RunnableTask is running...
RunnableTask is running...
ExtendedThread is running...
ExtendedThread is running...
RunnableTask is running...
ExtendedThread is running...
ExtendedThread is running...
RunnableTask is running...
RunnableTask is running...
ExtendedThread is running...
RunnableTask is running...
ExtendedThread is running...
All threads ended
Calling run()
ExtendedThread is running...
ExtendedThread is running...
ExtendedThread is running...
ExtendedThread is running...
ExtendedThread is running...
Continuing executing method main
```

Таким образом мы видим, что start() не блокирует текущий поток, а запускается в новом.  
А метод run() выполняет инструкции потока в текущем потоке.
