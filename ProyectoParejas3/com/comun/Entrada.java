����   = s  com/comun/Entrada  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lcom/comun/Entrada; inicializar ()Ljava/lang/String;     java/io/InputStreamReader	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  java/io/BufferedReader
     ! (Ljava/io/Reader;)V
  # $  readLine	  & ' ( out Ljava/io/PrintStream; * Entrada incorrecta)
 , . - java/io/PrintStream / 0 append /(Ljava/lang/CharSequence;)Ljava/io/PrintStream; 2 java/lang/Exception buzon Ljava/lang/String; flujo Ljava/io/InputStreamReader; teclado Ljava/io/BufferedReader; e Ljava/lang/Exception; StackMapTable = java/lang/String entero ()I
  A  
 C E D java/lang/Integer F G parseInt (Ljava/lang/String;)I I #

******** No es un entero *******

 , K L M println (Ljava/lang/String;)V
  O > ? valor I real ()D
 U W V java/lang/Double X Y parseDouble (Ljava/lang/String;)D [ )

******** No es un real(double) *******

  ] R S D cadena caracter ()C
 < c d ? length f %

******** No es un caracter *******

  h ` a
 < j k l valueOf (C)Ljava/lang/String;
 < n o p charAt (I)C 
SourceFile Entrada.java !               /     *� �    
                           �     +K� Y� � L� Y+� M,� "K� N� %)� +W*�     1  
   "                  )     *   ( 3 4     5 6    7 8    	 9 :  ;    �   <    1	 	 > ?     �     ;� @� B;� L� %H� J� N;�   	  1  
       &  + 	 ,  -  /  0  3        P Q     9 :  ;    �    1 	 R S     �     G� @� TG� M� %Z� J� \G&�   	  1  
       ;  @ 	 A  B  D  E  H        P ^     9 :  ;    �    1 	 _      4     � @K*�    
   
    P  Q        P 4   	 ` a     i     !� @K*� b� � %e� J� g� iK*� m�    
       Y  \  ^  _  b        P 4   ;    �  <  q    r