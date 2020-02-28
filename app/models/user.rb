class User < ApplicationRecord
  # Include default devise modules. Others available are:
  # :confirmable, :lockable, :timeoutable, :trackable and :omniauthable
  devise :database_authenticatable, :registerable,
         :recoverable, :rememberable, :trackable, :validatable, :timeoutable

  validates_presence_of :first_name, :last_name

  #or below method
  # validates :first_name, presence: true
  # validates :last_name, presence: true
  
end
