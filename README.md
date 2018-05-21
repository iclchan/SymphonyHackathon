# SymphonyHackathon

Generate the .p12 certificate from the provided pems.

``openssl pkcs12 -export -inkey bot.user34-key.pem  -in bot.user34-cert.pem -name bot34 -out bot34.p12``

Update the 2 properties in application.properties
<ul>
<li>symphony.truststore_file</li>
<li>symphony.user_cert_password</li>
</ul>

See below for information:
<ul>
<li>Symphony Documentation: https://developer-docs.symphony.com/</li>
<li>Symphony Java Client (And Examples): https://github.com/symphonyoss/symphony-java-client</li>
</ul>
