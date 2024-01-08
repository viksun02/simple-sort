Documentation for my solution:

First step was making this repository.
Second step was making a testing branch, so i can add some basic unit tests(can't get much better when testing a sorting algorithm :D), but before that i opened an issue that was closed later on.
Then I used SonarLint, it found a vulnerability -> SimpleSelectionSort.java should have been in a different package than my Main class. I moved the class and committed the changes(things didn't go very well as we can see in th commits).

After that it was time for building the Docker, I made a Dockerfile and used Trivy to scan it for vulnerabilities, sadly i didn't manage to fix them, cause I started doing everything too late.

After the Docker was done, it was time to make a pipeline and since i had a very bad experience last time i made a branch just for that. The workflow didn't work for a while because i was using an artifact in my docker(the .jar file).
So i changed the docker and then th workflow started working.

Last but not least i made an .yaml file to be able to deploy on kubernetes.
