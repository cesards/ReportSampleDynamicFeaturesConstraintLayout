App with kotlin dynamic feature included.
```
./gradlew bundleDebug; and bundletool build-apks --bundle=app/build/outputs/bundle/debug/app.aab --output=distribution/app.apks --ks=distribution/debug.keystore --ks-key-alias=androiddebugkey --ks-pass=pass:'android' --connected-device; and bundletool install-apks --apks=distribution/app.apks; and rm distribution/app.apks
```


## debug.keystore

Keystore name: "debug.keystore"
Keystore password: "android"
Key alias: "androiddebugkey"
Key password: "android"
CN: "CN=Android Debug,O=Android,C=US"