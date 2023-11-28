# MRM

 


![](010.png)


#√Creating the git repository


$ mk dir git-tutorial 
 
• : создал папку tutorial

$ cd git-tutorial  

• : вошёл в папку tutorial

$ git init  

• : инициализировал git



#√Creating the file 


• : создал два файла с текстом...


$ echo "pictyre the text" > MyFile

$ echo "echo the text.java the end" > My2File


#√Creating index


• : добавил в индекс для отслеживания в git


$ git update-index --add MyFile My2File



#√Вывел объекты базы данных на дисплей 

$ ls.git/Objects/???/*


$ ls.git/objects/?/*

#√Вывод объекта по имени объекта

•    : полное имя объекта
	
$ git cat-file -t 557db03de....

•    : сокращённое имя объекта 
	
$ git cat-file blob 557db03	

#√  
•    : показать разницу между тем 
	  ,что записано в индексе и то
		,что в настоящее время в рабочем дереве(tree) 
		
$ git diff-files

#√Добавим в файл My2File  
	  
$ echo "Это новая запись в My2File" >> My2File	

#√Далее смотрим изменения
	
$ git diff-files 

#√ 
•     :

$ git write-tree

$ tree=$(git write-tree)

$ commit=$(echo 'Initial commit' | git commit-tree $tree)

$ git update-ref HEAD $commit

•     :

$ git config --global user.name "rodomod"

$ git config --global user.email "Administrator@hotmail.com"
  

 
![](<a href="https://youtu.be/tPsfDhX6Jqs"> tetris the game </a>)