/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package rrr.bb

import spock.lang.Specification

class AppTestSpecification extends Specification {

     def "failingTest"() {
        System.out.println("This is a failing test from package")
       
        expect:
            111 == 0
    }
}
