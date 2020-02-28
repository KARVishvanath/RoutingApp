Rails.application.routes.draw do
  devise_for :users, path: '', path_names: { sign_in: 'login', sign_up: 'register', sign_out: 'logout' }
  resources :portfolios

  get 'java-items', to: 'portfolios#java'
  
  namespace :admin do
    get 'dashboard/main'
    get 'dashboard/user'
    get 'dashboard/blog'
  end
  
  get 'about', to: 'pages#about'
  get 'contact', to:'pages#contact', as:'call'
  resources :blogs
  resources :posts

  get 'posts/*missing', to:'posts#missing'

  get 'query/:something', to:'pages#something'

  root to:'pages#home'
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
end
