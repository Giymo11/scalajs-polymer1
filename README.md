# ScalaJS + Polymer

Let's see if we can get this to work...

## Setup

install node, the polymer cli and of course sbt and scala.

```
sudo add-apt-repository ppa:webupd8team/java

sudo apt-get update

sudo apt-get install oracle-java8-set-default
sudo apt-get install nodejs npm build-essential libssl-dev

npm install -g bower
npm install -g polymer-cli
npm install -g firebase-tools

echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt
```

## Development

Have one window open running `sbt ~fastOptJS`.

Then just do `polymer serve` on another window and enjoy!

