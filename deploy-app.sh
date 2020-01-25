cd dps-time-client
npm run build
rm -r ../dps-time-api/src/main/resources/static
cp -r build/. ../dps-time-api/src/main/resources/static/
cd ../dps-time-api
./mvnw clean package
mv ./target/TimeTracker-0.0.1.war ./target/TimeTracker.war
