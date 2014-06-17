AndroidGradleTests
==================
[![Build Status](https://travis-ci.org/Dornathal/AndroidGradleTests.svg?branch=master)](https://travis-ci.org/Dornathal/AndroidGradleTests)
Variations of gradle builds that setup unit and/or instrumentation tests

This repository showcases some setups of how different frameworks can be implemented in a gradle build configuration to test android applications.

Testing frameworks
------------------
###[Robolectric](http://robolectric.org/)
- Testing: [TDD](http://en.wikipedia.org/wiki/Test-driven_development), JUnit4
- Advantages:
  - Tests are executed on local machine 
  - Runs without Emulator or RealDevice
- Used in [RobolectricEspresso](https://github.com/Dornathal/AndroidGradleTests/RobolectricEspresso) 

###[Espresso](https://code.google.com/p/android-test-kit/)
- Testing: [Integration](http://en.wikipedia.org/wiki/Integration_testing)
- Advantages: 
 - Good readability of produced tests
- Disadvatages:
 - currently not in a central repository -> has to be included manualy in libs
- Used in [RobolectricEspresso](https://github.com/Dornathal/AndroidGradleTests/RobolectricEspresso)
