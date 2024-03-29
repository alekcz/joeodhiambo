(ns index
  (:require [pcp :as pcp]
            [garden.core :refer [css]]
            [garden.stylesheet :refer [at-media]]
            [garden.units :refer [px]]))

(def accent "#BB973A")
(def white "#FFFFFF")
(def weib "#0D274F")

(defn bg [url]
  (str "background-image: url(img/" url ")"))

(def resp 
  (pcp/html
    [:html 
      [:head 
        [:title "Joe Odhiambo - In Memoriam"]
        [:meta {:charset "utf-8"}]
        [:meta {:name "viewport" :content "width=device-width,initial-scale=1"}]
        [:link {:rel "shortcut icon" :type "image/png" :href "/favicon.png"}]
        [:meta {:name "description" :content "We lovingly remember Joseph Otieno Odhiambo, ja Asembo Kanyikela, to acknowledge and share both our joy in the gift that his life was to us, and the grief that his sudden and unexpected passing brings."}]
        [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
        [:link {:rel "preconnect" :href "https://fonts.googleapis.com"}]
        [:link {:rel "preconnect" :href "https://fonts.gstatic.com" :crossorigin nil}]
        [:link {:href "https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700&family=Playfair+Display&display=swap" :rel "stylesheet"
                :onload "this.onload=null;this.removeAttribute('media')"
                :media "print"}]
        ;; [:script {:src "https://cdn.jsdelivr.net/npm/macy@2"}]
        [:noscript
          [:link {:href "https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700&family=Playfair+Display&display=swap" :rel "stylesheet"}]]
        [:style 
          (css  [:* {:box-sizing "border-box"}]
                [:div {:display "flex"}]
                [:a {:cursor "pointer"}]
                [:html {:scroll-behavior "smooth"}]
                [:html :body {:margin "0px"
                       :padding "0px"
                       :font-family "Open Sans, sans-serif"
                       :font-weight "300"
                       :font-size "18px"}]
                [:.playfair {:font-family "Playfair Display, serif"
                             :font-weight "400"}]
                [:h1 {:font-size "50px" :margin-top "0px" :text-align "left" :color white :margin-bottom "40px"}]
                [:.subtitle {:color accent
                             :font-weight "700"
                             :margin "12px 0"
                             :text-transform "uppercase"}]
                [:p {:text-align "left"}]
                [:.strong {:min-width "130px" :margin-right "20px" :font-weight "700"}]
                [:h2 {:font-size "54px" :margin-bottom "60px"  :margin-top "0px" :line-height "64px" :color weib :text-align "left"}]
                [:h3 {:font-size "42px" :margin-bottom "40px"  :margin-top "0px" :line-height "50px" :color weib}]
                [:h4 {:font-size "20px" :color weib :text-align "left"}]
                [:span {:margin-bottom "2px"}]
                [:.word-mark {:text-transform "uppercase"
                              :font-weight "700"}]
                [:.hero  {:background-repeat "no-repeat"
                          :background-image "linear-gradient(181.48deg, rgba(0, 0, 0, 0.15) 19.2%, rgba(0, 0, 0, 0.65) 90.35%), url(img/hero.jpg)"
                          :background-position "center top"
                          :background-size "cover"
                          :height "700px"
                          :padding "90px 10vw"
                          :display "flex"
                          :position "relative"
                          :flex-direction "column"
                          :justify-content "flex-end"}
                  [:div {:display "flex"}]
                  [:img {:height "auto"
                         :width "37vw"
                         :position "absolute"
                         :bottom "0px"
                         :right "min(10vw, 50px)"}]]
                [:header {:display "flex"
                         :flex-direction "row"
                         :justify-content "space-between"
                         :position "absolute"
                         :top "60px"
                         :left "7vw"
                         :width "86vw"}]
                [:.menu {:line-height "25px"
                          :display "flex"
                          :justify-content "center"
                          :align-items "center"
                          :margin "5px 10px"
                          :font-weight "700"
                          :color white
                          :text-decoration "none"}]
                [:.menu:hover {:text-decoration "underline"}]
                [:.filler {:flex-grow "9999"}]
                [:.button {:width "auto"
                          :max-width "300px"
                          :height "50px"
                          :text-decoration "none"
                          :padding "5px 15px"
                          :display "flex"
                          :font-size "17px"
                          :justify-content "center"
                          :align-items "center"
                          :text-transform "uppercase"
                          :font-weight "600"
                          :letter-spacing "3px"}]
                [:.button:hover {:text-decoration "none"}]
                [:.primary {:color white
                            :background-color accent}]
                [:.secondary {:min-width "200px"
                              :color accent
                              :border-color accent
                              :background-color "rgba(155, 105, 30, 0.09)"
                              :margin-right "20px"}]
                [:.section {:padding "70px 10vw"
                           :display "flex"
                           :justify-content "flex-start"
                           :align-items "flex-start"
                           :flex-direction "column"}]
                [:.section--alt {:background "#EBF8FF"
                                 :align-items "center"}]
                [:.section--baby {:background "#EBF8FF"}]                                  
                [:.section--navy {:background weib}] 
                [:.section--thin {:padding "140px 10px 0px 10px"
                                  :justify-content "center"}
                  [:.title {:margin-left "10vw"}]
                  [:.subtitle {:margin-left "10vw"}]]  
                [:.section--family {:background "#EBF8FF"
                                    :padding-top "500px"
                                    :padding "500px 0px 0px 0px"
                                    :background-image "url(img/all.png)"
                                    :background-repeat "no-repeat"
                                    :background-position "top center"
                                    :min-height "400px"}] 
                [:.fade {:flex-direction "column"
                         :background "linear-gradient(rgba(255, 255, 255, 0) 9.96%, rgba(255, 255, 255, 0.82) 45.04%, rgba(255, 255, 255, 0.97) 75.08%);"
                         :width "100%"
                         :margin-top "-200px"
                         :padding "200px 10vw 0px 10vw"}]
                [:.stream {:margin-bottom "60px"}]
                [:.aside {:display "flex"
                          :flex-direction "column"
                          :justify-content "center"
                          :margin-left "70px"}
                  [:p {:margin "0px 0px 20px 0px"
                       :font-size "16px"}]
                  [:.subtitle {:font-weight "400"
                               :text-transform "capitalize"}]]
                [:a.watch {:display "flex"
                           :flex-direction "row"
                           :justify-content "center"
                           :align-items "center"
                           :width "240px"
                           :border-radius "25px"
                           :height "50px"
                           :background white
                           :font-size "16px"
                           :text-decoration "none"
                           :text-transform "uppercase"
                           :font-weight "700"
                           :color weib
                           :margin "10px 0"}]
                [:.play {:width "12px"
                         :margin-left "10px"}]
                [:.title {:text-align "left"}]
                [:.chapters {:display "flex"
                             :flex-direction "row"
                             :flex-wrap "wrap"
                             :justify-content "space-between"
                             :width "100%"
                             :padding "0px 10vw"
                             :background white}]
                [:.chapter {:display "flex" 
                            :flex-direction "column"
                            :width "37vw"
                            :padding "20px"
                            :margin-bottom "60px"}
                  [:p {:font-size "18px"
                       :line-height "26px"
                       :letter-spacing "0.3px"
                       :font-weight "400"}]
                  [:div.subtitle {:font-size "24px"
                               :margin "0"}]
                  [:img {:margin-bottom "20px"
                         :object-fit "cover"
                         :object-position "top center"
                         :width "100%"
                         :height "400px"
                         :border-radius "15px"}]]
                [:.gallery {:padding "0px 0vw 60px 0vw"
                            :background "#EBF8FF"
                            :display "flex"
                            :flex-wrap "wrap"
                            :justify-content "space-between"}]
                [:div.gallery-link {:flex-direction "column"
                                    :padding "20px"
                                    :background-color white
                                    :margin "0 0px 30px 00px"
                                    :border-radius "10px"}
                  [:a {:width "100%" 
                       :text-align "center" 
                       :font-weight "600" 
                       :display "flex"
                       :flex-direction "row"
                       :justify-content "center"
                       :align-items "center"}]]
                [:.image {:width "20vw"
                          :height "16vw"
                          :margin "10px 0"
                          :background-size "cover"
                          :background-repeat "no-repeat"}]
                [:.holder {:width "23vw"
                          :height "2px"
                          :background-size "cover"
                          :background-repeat "no-repeat"}]
                [:.dates {:color weib
                          :font-weight "600"}]    
                [:.white {:color white}]
                [:.no-bot {:margin-bottom "0px"}]                                               
                [:.thin-bot {:margin-bottom "8px"}]                                               
                [:footer {:padding "60px 10vw"
                         :display "flex"
                         :flex-direction "column"
                         :justify-content "center"
                         :align-items "center"
                         :font-weight "bold"
                         :color accent
                         :font-size "18px"}]
                [:.mobile {:display "none !important"}]
                [:div.info {:flex-direction "column"}]
                [:div.line {:display "flex" :width "100%" :font-size "16px"}])
          (css
            (at-media {:max-width (px 800)}
              [:.menu {:margin "5px 10px" :font-size "14px" :font-weight "400"}]
              [:.menu.word-mark {:display "none"}]
              [:header {:top "20px"
                        :justify-content "space-between"}
                [:.button.primary {:display "none"}]]
              [:h1 {:font-size "30px"}]
              [:h2 {:font-size "26px"}]
              [:h3 {:font-size "22px"}]
              [:.image {:width "70vw" :height "70vw"}]
              [:.stream {:flex-direction "column"}]
              [:.ctas {:flex-direction "column" :justify-content "center"}]
              [:.chapter {:width "80vw"}]
              [:.secondary {:margin-right "0px" :margin-bottom "20px"}]
              [:.aside {:margin-left "0"}]
              [:html :body {:font-size "14px"}]
              [:.section--family {:background-size "contain"
                                  :min-height "200px"}] 
              [:.fade {:padding "0px 00vw 20px 10vw"}]
              [:a.watch {:width "240px" :font-size "14px"}]
              [:.hero  {:height "280px"
                        :padding "40px 10vw 0px 10vw"
                        :justify-content "flex-end"}]
              [:img.joe {:top "40px"
                      :width "50vw"
                      :right "25vw"
                      :border-radius "100%"}]
              [:a.message.primary {:display "none"}]
              [:.mobile {:display "flex !important"}]
              [:.desktop {:display "none !important"}]))
          (css
            (at-media {:max-width (px 400)}
              [:.chapter [:img {:height "200px"}]]))]]
      [:body 
        [:div.hero 
          [:header 
            [:div.menu.word-mark "Joe Odhiambo"]
            [:div.filler]
            [:a.menu.desktop {:href "#memorials"} "Memorial Services"]
            [:a.menu.mobile {:href "#memorials"} "Memorials"]
            [:a.menu {:href "#gallery"} "Gallery"]
            [:a.menu {:href "#biography"} "Biography"]
            [:a.menu.mobile {:href "#contribute"} "Contribute"]
            [:div.filler]
            [:a.button.primary {:href "#contribute"} "Contribute"]]
          [:br] 
          [:br] 
          [:br] 
          [:br] 
          [:div.subtitle "1961 - 2021"]
          [:div.heading 
            [:h1.playfair "In Loving Memory of"
            [:br] "Joe Odhiambo"]]
          [:a.message.primary.button {:href "https://www.kudoboard.com/boards/Dm8efC7E"} "Leave a message"]]
        [:div#memorials.section.section--navy
          [:h2.title.playfair.white.no-bot "Memorial services"]
          [:p.white "We lovingly remember Joseph Otieno Odhiambo, ja Asembo Kanyikela, to acknowledge and share both our joy in the gift that his life was to us, and the grief that his sudden and unexpected passing brings. Joe, or Joese as he was fondly known, was a pillar of support not only to his family but to the entire clan. He was a kind, gentle, generous and emphatic soul."]
          [:a.watch {:style "width: 280px;"
                     :href "/memorial-programme.pdf"} "Download programmes" [:img.play {:style "width: 20px" :src "img/download.svg"}]]
          [:br] 
          [:br] 
          [:br] 
          [:div.stream
            [:a {:href "https://www.youtube.com/watch?v=LrNO0UHHDjU&ab_channel=GraphicExposure"}
              [:img {:src "img/stream0.png"}]]
            [:div.aside 
              [:div.subtitle "Pretoria, South Africa (11:00 AM - 26th July 2021)"]
              [:p.white "Memorial Service: Grobbelaars Chapel"
              [:br] "Program Director: Protus Seda"]
              [:a.watch {:href "https://www.youtube.com/watch?v=LrNO0UHHDjU&ab_channel=GraphicExposure"} "Watch Livestream" [:img.play {:src "img/play.svg"}]]]]
          [:div.stream
            [:a {:href "http://youtu.be/5T6b5OHp4bM"}
              [:img {:src "img/stream1.png"}]]
            [:div.aside  
              [:div.subtitle "Nairobi, Kenya (12:00 PM - 29th July 2021)"]
              [:p.white "Memorial Service: All Saints Cathedral"
              [:br] "Program Director: Max Muniafu"]
              [:a.watch {:href "http://youtu.be/5T6b5OHp4bM"} "Watch Livestream" [:img.play {:src "img/play.svg"}]]]]
          [:div.stream
            [:a {:href "https://youtu.be/qRwpim-zpXQ"}
              [:img {:src "img/stream2.png"}]]
            [:div.aside  
              [:div.subtitle "Asembo Kanyikela, Kenya (08:30 AM - 31st July 2021)"]
              [:p.white "Funeral Service: Asembo Kanyikela (next to Siger School)"
              [:br] "Master of Ceremony: Saul Sewe"
              [:br] "Officiating: Anglican Church of Kenya Bondo Diocese"]
              [:a.watch {:href "https://youtu.be/qRwpim-zpXQ"} "Watch Livestream" [:img.play {:src "img/play.svg"}]]]]]
        [:div#gallery.section.section--baby
          [:div.subtitle "Photo Gallery"]
          [:h2.title.playfair "Worth 1000 Words"]
          [:div.gallery 
            [:div.gallery-link 
              [:div.image {:style (bg "early.png")}]
              [:a "Early Life" [:img.play {:src "img/arrow-right.svg" :style "width: 20px"}]]]
            [:div.gallery-link 
              [:div.image {:style (bg "family.png")}]
              [:a "Family" [:img.play {:src "img/arrow-right.svg" :style "width: 20px"}]]]
            [:div.gallery-link 
              [:div.image {:style (bg "friends.png")}]
              [:a "Friends" [:img.play {:src "img/arrow-right.svg" :style "width: 20px"}]]]
            [:div.gallery-link 
              [:div.image {:style (bg "work.png")}]
              [:a "Work" [:img.play {:src "img/arrow-right.svg" :style "width: 20px"}]]]
            [:div.gallery-link 
              [:div.image {:style (bg "joe.png")}]
              [:a "Joe" [:img.play {:src "img/arrow-right.svg" :style "width: 20px"}]]]
            [:div.holder][:div.holder][:div.holder][:div.holder]]]
        [:div#biography.section.section--family
          [:div.fade
            [:div.subtitle "1961 - 2021"]
            [:h3.title.playfair "A life well lived"]]
          [:div#chapters.chapters
            ;; [:div.chapter
            ;;     [:img {:src "img/early.png"}]
            ;;     [:div.subtitle "Early life"]
            ;;     [:p "Born on the 24th of August 1961, Joe was the fourth born child of the late Engineer Apollo Odhiambo Augo and the late Mama Grace Nellie Akumu of Asembo Kanyikela."]
            ;;     [:p "He was brother to the late Lt. Col. Sam Odhiambo (Rtd.), Leah Krogsund, the late Ruth Wandia, the late Peter Michael Augo, Roseline Odede, Winnie Stella Anyango and Benjamin Monye."]]
            [:div.chapter
                [:img {:src "img/early.png"}]
                [:div.subtitle "Early life"]
                [:p "Born on the 24th of August 1961, Joe was the fourth born child of the late Engineer Apollo Odhiambo Augo and the late Mama Grace Nellie Akumu of Asembo Kanyikela."]
                [:p "He was brother to the late Lt. Col. Sam Odhiambo (Rtd.), Leah Krogsund, the late Ruth Wandia, the late Peter Michael Augo, Roseline Odede, Winnie Stella Anyango and Benjamin Monye."]]
            [:div.chapter
                [:img {:src "img/husband.png"}]
                [:div.subtitle "Marital life"]
                [:p "In 1989, Joe married the love of his life, Alice, a gracious lady, and they were very happily married for over 30 years. In addition to being a loving husband to her, he was also a fabulous father to their two children Leo and Sally. Joe and his family have been stationed in southern Africa since 1990."]
                [:p "Joe was son in law to the Late Mahallon Danga and the late Salome Danga of Seme Kopudo. He was a brother in law to Pamela Odhiambo, Lily Odhiambo, Vidar Krogsund, the late Maurice Wandia, Dr Jorry Odede, Cathy Odhiambo, Florence Buziba, David Danga, Mark Danga, Edwin Danga and Josephine Danga."]
                [:p "Joe was nephew to Jael Atieno, Margaret Ominde, the late Wilson Ndinya, the late Samuel Aduoga, Phillip Awuuor, the late James Chiawo, Peter Augo, Josephine Adhiambo, the late Pheobe Oluoch, the late Benter Yewa, Prof. Dan Kaseje, and Margaret Aboka."]
                [:p "He was a doting and much-admired uncle to Vivian, Tito, Anthony, Adi, Seje, Brian, Linda, Lizzie, Michelle Wandia, Phillip, Sami, Clara, Dianne, Yma, Asembo, Shani, Michelle Atieno, Charlie, Agnes, Godfrey, David, Daniel and many more."]]
            [:div.chapter
                [:img {:src "img/joe40.jpg"}]
                [:div.subtitle "Education"]
                [:p "Joe started his primary education at Xaverian Primary School when Mzee Augo transferred from Nairobi to Kisumu. He passed his Certificate of Primary Education (CPE) exams with triple A's and was able to join THE Lenana High School in Nairobi. He was at THE Lenana for 6 years before joining the University of Nairobi in 1982 for a course in Quantity Surveying."]
                [:p "He later pursued various further studies in advanced Project Management and a Masters of Business Administration (MBA) at the University of Pretoria, among other academic achievements."]]
            [:div.chapter
                [:img {:src "img/professional.png"}]
                [:div.subtitle "Professional life"]
                [:p "Joe’s first posting upon graduation was with the National Housing Corporation in Nairobi – a job he held until his departure for Lesotho in 1990 where he worked in a project for the African Development Bank."]
                [:p "In South Africa, Joe had an illustrious career; serving as a lecturer at the prestigious University of the Witwatersrand where he took a particular interest in mentoring young graduates and his staff members. He also worked as a Senior Project Manager at the giant oil company, SASOL"]
                [:p "Because of his exceptional leadership qualities, Joe was appointed the Chief Executive Officer of Agrément South Africa, an entity of the Department of Public Works, and this was a position he held for more than 12 years until the time of his passing."]]
            [:div.chapter
                [:img {:src "img/joe34.jpg"}]
                [:div.subtitle "Entrepreneurship"]
                [:p "Joe was an entrepreneur at heart\u003B he had brilliant business acumen and had a number of business interests which he planned to focus on upon retirement. His love for farming is evidenced by the many eucalyptus and moringa trees he planted in the ancestral home in Asembo."]]
            [:div.chapter
                [:img {:src "img/sport.jpg"}]
                [:div.subtitle "Sportsman"]
                [:p "Joe was a skilled and dedicated hockey player and was selected to play for the Kenyan national team. His late brother Sam described him as the best left-wing Kenya ever produced. He continued to play exceptionally well in local leagues in South Africa."]
                [:p "His general interest in all sports was astounding. He was an ardent football and rugby fan\u003B when he was watching sports, the quiet Joe would transform into a rowdy fan, at times even kicking the table in his excitement and shouting “Come on Joe!” He always enjoyed physical activities, even competing in a number of marathons."]]
            [:div.chapter
                [:img {:src "img/joe44.jpg"}]
                [:div.subtitle "Music"]
                [:p "Although Joe sang off pitch, he loved Lingala and Luo music and had the latest collection of music stashed all over the house and cars. His favourite musicians were Franco and Musa Juma. He loved \"Nyar Ahero\" song by Musa Jakadala which was played for him until his last day on earth."]]
            [:div.chapter
                [:img {:src "img/friends28.jpg"}]
                [:div.subtitle "Social Impact"]
                [:p "Joe had a heart for people, which can be atested by the number of people he helped in the course of his life. He was a foster parent to many children and supported a number of orphans. Although he had a quiet nature, he was very good at interacting with people."]
                [:p "Joe was instrumental in the formation of the Kenya Welfare Association South Africa in (KEWSA) in early 2004. This forum was crucial in fostering a real sense of community among fellow Kenyans within South Africa."]]
            [:div.chapter
                ;; [:img {:src "img/family.png"}]
                [:div.subtitle "Illness"]
                [:p "Joe collapsed at his residence in Pretoria in the early morning of 17 June 2021. He was rushed to the hospital and admitted in a critical condition. Despite putting up a valiant fight against the illness, unfortunately Joe succumbed to multiple organ failure on 15 July 2021."]
                [:p "We would like to thank the medical team at the Heart Hospital led by Dr Adeyemo. Our special thanks also go to Dr Mwangi. May God bless you all."]]]]
        [:div#contribute.section.section--alt
          ;; [:div.subtitle "A helping hand"]
          [:h3.title.playfair "In loving memory of Joe Odhiambo"]
          [:div.ctas
            [:a.button.secondary {:href "https://www.kudoboard.com/boards/Dm8efC7E"} "Leave a message"]
            [:a.button.primary {:href "https://secure.changa.co.ke/myweb/share/48583"} "Contribute online"]]
          [:br][:br]
          [:div.info
            [:h4.thin-bot "Contribute via EFT"]
            [:div.line [:div.strong "Name: "] [:div.details "DCO Owaga"][:br]]
            [:div.line [:div.strong "Bank: "] [:div.details "ABSA"]]
            [:div.line [:div.strong "Account No: "]  [:div.details "9094613153"]]
            [:div.line [:div.strong "Branch Code: "]  [:div.details "632005"]]
            [:div.line [:div.strong "Swift Code: "]  [:div.details "ABSAZAJJ"]]
            [:div.line [:div.strong "Reference: "] [:div.details "Your Name & Surname"]]]
          [:div.info
            [:h4.thin-bot "Contribute via M-pesa"]
            [:div.line [:div.strong "Mpesa: "] [:div.details "+254798212410"]]
            [:div.line [:div.strong "Reference: "] [:div.details "Your Name & Surname"]]]
          [:br][:br]]
        [:footer "1961 - 2021"]
        [:script {:src "/script.js"}]]]))

;; (pcp/response 200 resp "text/html")            
(pcp/response 200 "pew pew" "text/plain")   