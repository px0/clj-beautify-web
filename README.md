# beautify-web

A clojure wrapper for the [Beautify-Web](https://github.com/beautify-web/js-beautify) JavaScript library that prettifies HTML.

If you have spent time trying to find the magical combination of [JTidy](http://jtidy.sourceforge.net/) options that will make your markup pretty without messing something up, or fought with [pretty-printing XML](https://snipplr.com/view/30351/pretty-printer-xml-in-clojure/), or gotten frustrated at the results of "prettify HTML java" on StackOverflow, then this library is for you. I feel your pain.

## Install

Leiningen/Boot

`[px0/beautify-web "0.1.0"]`

Clojure CLI/deps.edn

`px0/beautify-web {:mvn/version "0.1.0"}`

## Usage

This library exposes 3 functions:

- `beautify-html`
- `beautify-css`
- `beautify-js`

Each takes a string, and returns a prettily formatted string. Couldn't be easier!

Example
```clj
(require '[beautify-web.core :as bw])
(bw/beautify-html "<ul class=\"nav navbar-nav\"><li class=\"active\"><a href=\"/\">Hauptseite</a></li><li><a href=\"/preise\">Preise</a></li><li><a href=\"/kontakt\">Kontakt</a></li></ul>")

;=> "<ul class=\"nav navbar-nav\">
;=>    <li class=\"active\"><a href=\"/\">Hauptseite</a></li>
;=>    <li><a href=\"/preise\">Preise</a></li>
;=>    <li><a href=\"/kontakt\">Kontakt</a></li>
;=> </ul>"

```

## License

Copyright © 2018 Max Gerlach

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
