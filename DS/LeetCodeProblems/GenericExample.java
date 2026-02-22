// Poem interface
public interface Poem {
    void recite();
}

// Sonnet29 class implementing Poem
public class Sonnet29 implements Poem {
    public void recite() {
        System.out.println("When, in disgrace with fortune and men's eyes, ...");
    }
}

// PoeticJuggler class with constructor injection
public class PoeticJuggler {
    private int beanBags;
    private Poem poem;

    public PoeticJuggler(int beanBags, Poem poem) {
        this.beanBags = beanBags;
        this.poem = poem;
    }

    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS WHILE RECITING...");
        poem.recite();
    }
}
Step 2: Spring Configuration File (XML)
xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <bean id="sonnet29" class="Sonnet29"/>
    <bean id="poeticDuke" class="PoeticJuggler">
        <constructor-arg value="15"/>
        <constructor-arg ref="sonnet29"/>
    </bean>
</beans>
Step 3: Using Spring to Get the Bean
java
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
PoeticJuggler poeticDuke = (PoeticJuggler) context.getBean("poeticDuke");
poeticDuke.perform();
Output:
text
JUGGLING 15 BEANBAGS WHILE RECITING...
When, in disgrace with fortune and men's eyes, ...
