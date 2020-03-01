# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rails db:seed command (or created alongside the database with db:setup).
#
# Examples:
#
#   movies = Movie.create([{ name: 'Star Wars' }, { name: 'Lord of the Rings' }])
#   Character.create(name: 'Luke', movie: movies.first)
3.times do |topic|
    Topic.create!(
        title: "Topic #{topic}"
    )
end
puts "topic post created"


10.times do |blog|
    Blog.create!(
        title: "This is my #{blog}",
        body: "This is my body container for the blog #{blog}",
        topic_id: Topic.last.id
    )
end
puts "blog post created"

5.times do |portfolio|
    Portfolio.create!(
        title: "This Portfolio #{portfolio}",
        sub_title: "Ruby on Rails",
        body: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
        incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
        exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu
        fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in 
        culpa qui officia deserunt mollit anim id est laborum.",
        main_img: "https://via.placeholder.com/700x300",
        thamb_img: "https://via.placeholder.com/300x150"
    )
end

2.times do |portfolio|
    Portfolio.create!(
        title: "This Portfolio #{portfolio}",
        sub_title: "Java",
        body: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
        incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
        exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu
        fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in 
        culpa qui officia deserunt mollit anim id est laborum.",
        main_img: "https://via.placeholder.com/700x300",
        thamb_img: "https://via.placeholder.com/300x150"
    )
end

2.times do |portfolio|
    Portfolio.create!(
        title: "This Portfolio #{portfolio}",
        sub_title: "Selenium WebDriver",
        body: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
        incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
        exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu
        fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in 
        culpa qui officia deserunt mollit anim id est laborum.",
        main_img: "https://via.placeholder.com/700x300",
        thamb_img: "https://via.placeholder.com/300x150"
    )
end
puts "portfolio item created"

10.times do |skill|
    Skill.create!(
        title:"Skill #{skill}",
        percent_utilised: 30
    )
end
puts "skills added"

3.times do |technology|
    Technology.create!(
        name: "Technology #{technology}",
        portfolio_id: Portfolio.ids.last
    )
end
puts "Technogies Created"


