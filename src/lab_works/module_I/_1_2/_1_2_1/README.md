##Laboratory Work 1.2.1

Write a program prints on console each of the following patterns of 
letters presented as schema of symbolic sequence: J A V A.

####Here is solution 1.2.1. code:

*lab_works.module_I._1_2._1_2_1*
```java
package lab_works.module_I._1_2._1_2_1;


/*
 * Write a program prints on console each of the following patterns: (a)-(b)-(c)-(b).
 * 1. ....***.....*.....*.....*.....*
 * 2. ......*....*.*.....*...*.....*.*
 * 3. ..... *....***......*.*......***
 * 4. ....**.....*.*.......*.......*.*
 *        (a)    (b)      (c)
 */
public class LabWork_1_2_1 {

    public static void main(String[] args) {

        System.out.println(
                "    ***     *     *     *     * \n" +
                "      *    * *     *   *     * *\n" +
                "      *    ***      * *      ***\n" +
                "    **     * *       *       * *\n"
        );
    }
}

```