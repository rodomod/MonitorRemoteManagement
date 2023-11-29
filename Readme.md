#   MRM

 


![](010.png)


##   √Creating the git repository

   *создал папку tutorial

```
$ mk dir git-tutorial 

```
      ~~создал папку tutorial~~

```
$ cd git-tutorial
 
``` 
       ~~вошёл в папку tutorial~~
```
$ git init 

``` 
       ~~инициализировал git~~
   
   

```
$ echo "pictyre the text" > MyFile


$ echo "echo the text.java the end" > My2File

```
       ~~создал два файла с текстом~~
   
   

```
$ git update-index --add MyFile My2File

```
       ~~добавил в индекс для отслеживания в git~~
   
   

```
$ ls.git/Objects/???/*


$ ls.git/objects/?/*

```
        ~~Вывел объекты базы данных на дисплей~~ 





```
$ git cat-file -t 557db03de....

```

   
         ~~Вывод объекта  полное имя объекта~~
   
   
   
```
$ git cat-file blob 557db03	

```
  

        ~~Вывод объекта  сокращённое имя объекта~~ 
   
 
 

	
```	
$ git diff-files

```



      ~~показать разницу между тем~~
	    ~~,что записано в индексе и то~~
		   ~~,что в настоящее время в рабочем дереве~~**(tree)**


		

 
```
$ echo "Это новая запись в My2File" >> My2File	

```
            ~~Добавим в файл My2File~~ 



```	
$ git diff-files

``` 



       ~~Далее смотрим изменения~~

  
   
   

```
$ git write-tree

$ tree=$(git write-tree)

$ commit=$(echo 'Initial commit' | git commit-tree $tree)

$ git update-ref HEAD $commit

```
  


        ~~работаем с деревом~~   
  
  
  


     ```
	 $ git config --global user.name "rodomod"
	 ```
    ~~задаём имя пользователя~~     
   
    ```
	$ git config --global user.email "Administrator@hotmail.com"
	```

     ~~задаём почту пользователя~~     


 
[![](**играем в тетрис** ==>)](<a href="https://youtu.be/tPsfDhX6Jqs"> tetris the game </a>)