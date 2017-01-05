Написать HTTP сервер, возвращающий статические файлы по GET запросу

Корневой каталог фиксированный или настраивается в конфиге

Кэширование файлов в памяти настраивается в конфиге, по-умолчанию все файлы кэшируются, при обновлении файлов на диске кэш можно обновить без перезапуска

Поддерживает только HTTP метод GET

Поддерживает **HTTP коды**:
+ 200 - файл найден, 
+ 404 - файл не найден, 
+ 405 - метод запроса не GET, 
+ 400 - если какие-либо параметры запроса не валидны

Content-type - возвращает тип файла и кодировку. Тип файла автоопределяет по расширению.
Поддерживаемые типы контента: 
+ text/html, 
+ application/javascript, 
+ image/jpeg
