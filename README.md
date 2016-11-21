# ScalaJS + Polymer

Let's see if we can get this to work...

## Setup

install node, the polymer cli and of course sbt and scala. Don't forget to let bower grab the dependencies for you!

```
sudo add-apt-repository ppa:webupd8team/java

sudo apt-get update

sudo apt-get install oracle-java8-set-default
sudo apt-get install nodejs npm build-essential libssl-dev

npm install -g bower
npm install -g polymer-cli
npm install -g firebase-tools

bower install

echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt
```

## Development

Have one window open running `sbt ~scalajsPolymer/fastOptJS`, one doing `sbt ~polymerHtmlGen/run`.

Then just do `polymer serve` in another window and enjoy!

## TODO

Figure out how to get the most information and typesafety without repeating stuff all the time.
Maybe put some stuff into shared (between JS and JVM)? Maybe the tags themselves?

Get one clean command for generating the HTML and the JS going.

