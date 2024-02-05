# imp sections of build.gradle
```groovy
    id 'groovy'
```
```groovy
    testImplementation 'org.spockframework:spock-core:2.2-groovy-3.0'
    testImplementation 'junit:junit:4.13.2'

    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
```
```groovy
    task acceptanceTests(type: Test) {
filter {
        includeTestsMatching("rrr.bb.*")
    }
}

tasks.named('acceptanceTests') {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
    testLogging {
		exceptionFormat = 'full'
		showStandardStreams = true
	}


}
```
```groovy
task acceptanceTests(type: Test) {
	systemProperties System.getProperties()
    filter {
        includeTestsMatching("com.sap.cds.abntest.*Specification*")
    }
}
```