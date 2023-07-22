# Trabajo de la asignatura CPM: Combate por turnos
Un proyecto de temática libre hecho para la asignatura Comunicación Persona Máquina (2o año) como primer trabajo entregable. La temática que elegí se basó en la creación de un juego por turnos.

![image](https://github.com/Sauleteh/trabajo-cpm-combate/assets/22859905/e89b4100-8397-4261-8cea-bf710ffe486a)
![image](https://github.com/Sauleteh/trabajo-cpm-combate/assets/22859905/e9935bf5-7dde-4577-a894-e34944ca2101)
![image](https://github.com/Sauleteh/trabajo-cpm-combate/assets/22859905/f2a18aff-cbff-474e-b8f9-ae010e57cac4)

## Documentación extendida
Se mostrará una interfaz con dos botones para elegir un héroe (tú) y un enemigo (la IA), justo debajo se encuentra la información de ambos personajes (el nombre, la vida máxima, el ataque, la defensa, la probabilidad crítica y la debilidad inicial). A continuación, en la parte inferior se encuentra la parte de la batalla donde se mostrará la vida actual de los personajes y sus debilidades además de tres botones: luchar, atacar y defender. Al darle a luchar, los dos personajes combatirán entre ellos y solo habrá un vencedor, tu controlarás el héroe y tu misión será dejar sin vida al enemigo. Para ello, tendrás que hacer uso de los botones atacar y defender.

Cada vez que atacas, tu fatiga aumentará y cuanto más alta sea la fatiga, más posibilidades hay de que falles un ataque, también puede darse el caso de que hagas un golpe crítico que romperá las defensas de tu adversario y le hará el doble de tu ataque. Si te defiendes, ganarás un 75% más de defensa ese turno y reducirás tu fatiga en gran medida, además puede ocurrir que hagas una defensa perfecta según tu probabilidad crítica y contrarrestes el ataque de tu rival, infligiendo un 50% del daño que se hubiera recibido.
Toda la acción estará escrita en el cuadro de texto situado en la parte más baja de la interfaz, mantén tu fatiga baja y tu vida alta para poder ganar. El modo IA avanzada hará que el contrincante tenga al empezar el doble de vida.

En la interfaz de selección de héroe, se podrá elegir entre varios héroes predefinidos o hacer hasta 5 héroes personalizados, además de tener un pequeño panel donde dibujar a tu héroe favorito. Sobre este panel se puede ejecutar una tarea para que dibuje una cuadrícula y así sea más fácil el poder dibujar.
En la selección de enemigos podrás escoger entre varios monstruos que te darán un buen reto, además de contar con otra pestaña repleta de jefes que serán un desafío muchísimo mayor.

### Atributos de los personajes
· **La vida**: Son los puntos de salud máximos del personaje, muy importante para su supervivencia en el campo de batalla.<br>
· **El ataque**: Puntos de daño base que se hará al contrario. Sin suficientes puntos de daño no matarás lo suficientemente rápido y puede que acaben contigo antes que tú con él.<br>
· **La defensa**: Son los puntos de absorción de daño en forma de porcentaje, es decir, absorberás generalmente un <defensa>% del ataque del contrario. El máximo posible de defensa que se puede tener es 50.<br>
· **La probabilidad crítica**: Puntos que se tratan como porcentaje y que sirven tanto al atacar como al defender. Si atacas y hacer crítico, ignoras la defensa del contrario y haces el doble de tu daño base. Si defiendes y haces crítico, devuelves el 50% del daño que recibirías sin que pierdas nada de vida. Máximo 100 de probabilidad.<br>
· **La fatiga**: Puntos de cansancio que se tratan como un porcentaje, cada vez que atacas hay un <fatiga>% de que falles el ataque, pierdas un 20% de la vida y a cambio devuelves tu fatiga a su estado inicial.

### El combate
Cuando se haga clic en luchar, se podrán realizar dos acciones: atacar y defender. Tú eres el héroe y empiezas primero. Si atacas, aumentarás tu fatiga por lo que atacar todo el rato no es buena idea. Si te defiendes, recuperarás bastante fatiga y aumentarás tu defensa en ese turno un 75%. Intenta mantener tu salud y fatiga a raya para vencer al enemigo.

Si quieres dificultad, el modo IA avanzada aumentará la vida de los enemigos el doble y, si aún deseas más dificultad, prueba a luchar contra un jefe en vez de monstruos normales, la diferencia es bastante alta.
