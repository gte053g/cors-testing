# cors-testing

#Setup:
## Modify _hosts_ file
1. Open text editor (Notepad++ etc) as Administrator
2. In the text editor open the file: _C:\Windows\System32\drivers\etc\hosts_
3. Add the following to the _hosts_ file:
```
127.0.0.1	apione.corstesting.com
127.0.0.1	apitwo.corstesting.com
```

## Run API applications
1. Open _Spring Tool Suite_ and import both api1 and api2 projects into workspace
2. Start both api1 and api2


## Test
1. If necessary, disable HTTP Proxy (or bypass for *.corstesting.com)
2. Open browser to _http://apione.corstesting.com:8081/apione/auth/_
3. In browser, confirm the cookie is set (name=authCookie)