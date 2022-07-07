# Silence

Block unknown callers.

[<img 
    src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png"
    alt="Get it on F-Droid"
    height="80">](https://f-droid.org/packages/me.lucky.silence/)

<img 
    src="https://raw.githubusercontent.com/x13a/Silence/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png" 
    width="30%" 
    height="30%">

By default numbers not in your contacts are blocked.

Optionally allow:
* Numbers you have contacted
* Numbers within the selected groups
* X registered call(s) from the same number within a set amount of minutes
* Numbers found in messages
* Numbers passing STIR verification (Android 11)

If the app rejects calls from contacts on Android 10, allow contacts permission manually in 
`App info → Permissions`.

## Permissions

* CALL_SCREENING - block or allow call
* READ_CALL_LOG - check you have called the number and count times the number have called you in T minutes
* READ_SMS - check you have sent a message to the number and you received a message from the number
* RECEIVE_SMS - find mobile numbers in incoming messages
* READ_PHONE_STATE - check on which SIM the number is calling
* RECEIVE_BOOT_COMPLETED - persist clean expired numbers job across reboots
* READ_CONTACTS - check the number exists in contacts on Android 10

## Localization

Is `Silence` not in your language, or the translation is incorrect or incomplete? Get involved on 
[Weblate](https://hosted.weblate.org/engage/me-lucky-silence/).

[![Translation status](https://hosted.weblate.org/widgets/me-lucky-silence/-/app/horizontal-auto.svg)](https://hosted.weblate.org/engage/me-lucky-silence/)

## License
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)  

This application is Free Software: You can use, study share and improve it at your will. 
Specifically you can redistribute and/or modify it under the terms of the
[GNU General Public License v3](https://www.gnu.org/licenses/gpl.html) as published by the Free 
Software Foundation.
