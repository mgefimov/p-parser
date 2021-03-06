# Парсер для языка P
## Конкретный синтаксис языка P

Программа на языке P состоит из возможно пустого множества определений отношений, за
которыми следует цель, отделенная символом `?-`.

Отношение состоит из нескольких строк, его определяющих. Каждая строка состоит из головы
и тела, разделенных символом `:-`.

Голова состоит из идентификатора (название отношения) и списка аргументов в круглых скобках 
`(, )`, разделенных запятыми `,`.

Аргументом может быть либо переменная, либо атом.

Атом — идентификатор и список аргументов в круглых скобках через запятую.

Переменная всегда начинается с заглавной латинской буквы. Идентификатор — со строчной
латинской буквы. Имена переменных и идентификаторов содержат только латинские буквы либо
цифры 0 – 9.

Тело состоит из возможно пустой последовательности атомов, разделенных запятой, в конце
тела стоит точка `.`.

Цель — возможно пустая последовательность атомов, разделенных запятой, в конце стоит точка.

Если список аргументов атома пуст, скобки опускаются.

Если тело пусто, символ `:-` опускается.

Пробелы и переносы строк между лексемами не являются значащими. Их удаление не должно
повлиять на результат синтаксического анализа корректной программы

## Пример программы на языке P

```
eval(St, var(X), U) :- elem(X, St, U).
eval(St, conj(X,Y), U) :- eval(St, X, V), eval(St, Y, W), and(V, W, U).
eval(St, disj(X,Y), U) :- eval(St, X, V), eval(St, Y, W), or(V, W, U).
eval(St, not(X), U) :- eval(St, X, V), neg(U, V).

elem(zero, cons(H,T), H).
elem(succ(N), cons(H,T), V) :- elem(N, T, V).
nand(false, false, true).
nand(false, true, true).
nand(true, false, true).
nand(true, true, false).
neg(X, R) :- nand(X, X, R).
or(X, Y, R) :- nand(X, X, Xx), nand(Y, Y, Yy), nand(Xx, Yy, R).
and(X, Y, R) :- nand(X, Y, Xy), nand(Xy, Xy, R).
?- eval(St, conj(disj(X,Y),not(var(Z))), true).
```