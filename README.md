Android unit test alternatives experiments
==========================================

Sample project experimenting some of the alternatives available in Android for unit testing.

AndroidTestAlternatives/app
---------------------------
* Sample app under test
* Based on AndroidTestingFun.zip. https://developer.android.com/training/activity-testing/activity-unit-testing.html

AndroidTestAlternatives/app/tests_instrumentation
-------------------------------------------------
* Some tests done in the "official" the way Google suggests.
* Intrumentation tests, uses the instrumentation tools provided by Google in the SDK
* Run on Dalvik (real devices or emulator)
* https://developer.android.com/training/activity-testing/activity-unit-testing.html 

AndroidTestAlternatives/app/tests_espresso
------------------------------------------
* Also uses the official instrumentation tools
* ...but includes Espresso: framework provided by Google to make UI tests easier
* https://code.google.com/p/android-test-kit/wiki/Espresso

AndroidTestAlternatives/app/tests_robolectric
---------------------------------------------
* Uses robolectric instead of the official Google's instrumentation tools
* Runs in the JVM
* http://robolectric.org/
