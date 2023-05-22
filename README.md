# ElProblemaDeLaParadaJuanCarlosOrtega

## Mi repositorio: https://github.com/Juank2003/ElProblemaDeLaParadaJuanCarlosOrtega.git

Realiza en código Java lo que describe el siguiente video:

https://www.youtube.com/watch?v=92WHN-pAFCs

Alan Turing planteó el "problema de parar" en 1936 para demostrar la existencia de problemas indecidibles. Este problema busca determinar si un programa determinado terminará de ejecutarse o si se ejecutará indefinidamente. Turing demostró que no existe un algoritmo que pueda analizar cualquier programa y decidir si se detendrá o no. Utilizando una prueba por contradicción, Turing imaginó un programa llamado HaltChecker que utiliza este algoritmo hipotético de parada. Luego propuso otro programa llamado Reverser, que utiliza HaltChecker para analizar su propio código y determinar si se detendrá o no. Sin embargo, al analizar Reverser, se llega a una contradicción, ya que tanto si HaltChecker devuelve "para" como si devuelve "nunca", se llega a un resultado incorrecto. Esto demuestra que no es posible tener un algoritmo general para determinar la parada de cualquier programa.


Resultado: El código proporcionado muestra una implementación relacionada con la descripción del problema de la parada utilizando los patrones de diseño Builder y adapter. Además, utiliza estrategias de ejecución como CountdownStrategy y CountupStrategy para definir diferentes formas de ejecutar la paradoja.
