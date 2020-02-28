class Portfolio < ApplicationRecord
    has_many :technologies
    accepts_nested_attributes_for :technologies, 
                                   reject_if: lambda { |attr| attr['name'].blank? }               
    include Placeholder
    validates_presence_of :title, :sub_title, :body, :thamb_img, :main_img

    # Below both methods work same 1. Normal, 2. Lambda (Encapsulating entire process in ruby)
    # 1.
    def self.java
        where(sub_title: 'Java')
    end
    # 2.
    def self.selenium
        where(sub_title: 'Selenium WebDriver')
    end

    #implementing the custome scope video 78
    scope :ruby_on_rails, -> { where(sub_title: 'Ruby on Rails') }

    
    #setting default values if nill or not found
    after_initialize :set_defaults
    def set_defaults
        #type 1
        if self.thamb_img == nil
         self.thamb_img = 'https://via.placeholder.com/300x150'
        end
        #type 2 (Short Cut method)
        self.main_img ||= Placeholder.image_generator(height:'700', width:'300')
        #'https://via.placeholder.com/700x300'
    end

end
